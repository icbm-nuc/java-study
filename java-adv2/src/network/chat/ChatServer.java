package network.chat;

import java.io.IOException;
import java.net.ServerSocket;

import static util.MyLogger.log;

public class ChatServer {

    private static final int PORT = 12345;

    static void main(String[] args) throws IOException {
        log("채팅 서버 시작");
        ChatSessionManager sessionManager = new ChatSessionManager();
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소캣 시작 - 리스닝 포트 : " + PORT);

        try {


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
