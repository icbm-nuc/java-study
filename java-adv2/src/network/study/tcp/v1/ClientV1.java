package network.study.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class ClientV1 {

    private static final int PORT = 12345;

    static void main(String[] args) throws IOException {
        log("클라이언트 시작");
        Socket socket = new Socket("localhost",12345);

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("소캣 연결: " + socket);

        Scanner scanner = new Scanner(System.in);

        String toSend = scanner.nextLine();
        output.writeUTF(toSend);
        log("client -> server : " + toSend);

        String received = input.readUTF();
        log("server -> client : " + received);

        //자원 정리
        input.close();
        output.close();
        socket.close();


    }
}
