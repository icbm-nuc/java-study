package network.chat;

import network.tcp.SocketCloseUtil;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class ChatClient {

    private static final int PORT = 12345;

    // [변경] `static void main` -> `public static void main`
    public static void main(String[] args) throws IOException {
        log("채팅 프로그램 시작");
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket("localhost", PORT);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        // [추가] 서버에서 오는 메시지를 실시간으로 받는 수신 스레드 시작
        Thread readThread = new Thread(new Reader(input));
        readThread.start();

        while (true) {
            // [삭제] 루프 시작 시 `log("메시지 보내기 client -> server")` 제거
            String message = scanner.nextLine();

            if (message.equals("exit")) {
                // [추가] 종료 전에 서버에도 "exit" 메시지를 전송
                output.writeUTF("exit");
                break;
            }
            output.writeUTF(message);

            // [삭제] 보낸 직후 `input.readUTF()`를 동기적으로 기다리던 코드 제거 (실시간 수신은 `Reader` 스레드가 담당)
        }

        // [변경] `output.close()`, `input.close()`, `socket.close()` 개별 호출 -> `SocketCloseUtil.closeAll(...)`로 변경
        SocketCloseUtil.closeAll(socket, input, output);
        // [추가] 프로그램 종료 로그 추가
        log("채팅 프로그램 종료");
    }
}