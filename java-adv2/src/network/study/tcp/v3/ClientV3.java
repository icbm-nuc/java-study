package network.study.tcp.v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class ClientV3 {

    private static final int PORT = 12345;

    static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", PORT);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream input = new DataInputStream(socket.getInputStream());

        log("client 소켓 시작 : " + PORT);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String toSend = scanner.nextLine();
            output.writeUTF(toSend);
            log("client -> server" + toSend);

            if(toSend.equals("exit")) {
                break;
            }


            String received = input.readUTF();
            log("server -> client: " + received);

        }
    }
}
