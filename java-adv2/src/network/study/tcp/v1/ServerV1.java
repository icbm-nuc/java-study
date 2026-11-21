package network.study.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV1 {

    private static final int PORT = 12345;

    static void main(String[] args) throws IOException {
        log("서버 시작 ");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스팅 포트 " + PORT);

        Socket socket = serverSocket.accept();
        log("소캣 연결: " + socket);

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        //클라이언트한테 메시지 받기
        String recieved = input.readUTF();
        log("client -> server : " + recieved);

        //보내기
        String toSend = recieved + " World!";
        output.writeUTF(toSend);
        log("server -> client : " + toSend);

        //자원 정리
        input.close();
        output.close();
        socket.close();


    }
}
