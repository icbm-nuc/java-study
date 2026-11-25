package network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

public class ChatSession implements Runnable {

    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final ChatSessionManager sessionManager;
    private boolean closed = false;
    // [삭제] 1단계 브로드캐스트에서는 아직 미사용인 `name` 필드 및 getter/setter 제거

    public ChatSession(Socket socket, ChatSessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {
        try {
            while (true) {
                // [삭제] 루프마다 `new Thread(new Reader(input)).start()`를 만들던 코드 제거 (스트림 경쟁 방지)
                String message = input.readUTF();
                log(socket + "에게 받은 메시지 : " + message);
                sessionManager.sendToAll(message);
            }
        } catch (IOException e) {
            // [변경] `throw new RuntimeException(e)` -> 연결 종료 로그 출력으로 변경
            log("연결 종료 또는 오류 : " + socket);
        } finally {
            sessionManager.remove(this);
            // [추가] 예외/종료 시 소켓과 스트림을 확실히 닫도록 `close()` 호출 추가
            try {
                close();
            } catch (IOException ignored) {
            }
        }
    }

    public void close() throws IOException {
        if (closed) {
            return;
        }
        closeAll(socket, input, output);
        closed = true;
        log("연결 해제 : " + socket + " isClosed : " + socket.isClosed());
    }

    public void sendMessage(String message) throws IOException {
        output.writeUTF(message);
    }
}