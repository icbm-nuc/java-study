package network.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ChatServer {

    private static final int PORT = 12345;

    // [변경] `static void main` -> `public static void main`
    public static void main(String[] args) throws IOException {
        log("채팅 서버 시작");
        ChatSessionManager sessionManager = new ChatSessionManager();
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소캣 시작 - 리스닝 포트 : " + PORT);

        try {
            while (true) {
                Socket socket = serverSocket.accept();
                log("소캣 연결 " + socket);

                ChatSession chatSession = new ChatSession(socket, sessionManager);
                Thread thread = new Thread(chatSession);
                thread.start();
            }
        } catch (IOException e) {
            log("서버 소캣 종료 " + e);
        }
    }
}