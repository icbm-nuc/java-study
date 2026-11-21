package network.study.tcp.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV2 {

    private static final int PORT = 12345;

    static void main(String[] args) throws IOException {
        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 포트: " + PORT);

        //
        Socket socket = serverSocket.accept();
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        while (true) {
            String received = input.readUTF();
            log("client -> server : " + received);

            if( received.equals("exit")) {
                break;
            }
            String toSend = received + " Hello!";
            output.writeUTF(toSend);
            log("server -> client : " + toSend);
        }

        //자원정리
        input.close();
        output.close();
        socket.close();

    }
}
