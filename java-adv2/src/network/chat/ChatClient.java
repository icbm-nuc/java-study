package network.chat;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import static util.MyLogger.log;

public class ChatClient {

    private static final int PORT = 12345;

    static void main(String[] args) {
        log("채팅 프로그램 시작");

        Scanner scanner = new Scanner(System.in);


        try (Socket socket = new Socket("localhost", PORT);
             DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {



            while (true) {

                String string = scanner.nextLine();
                String[] split = string.split("\\|");

                if (split[0].equals("/join")) {
                    enterChatprogram(split[1] , output);
                } else if (split[0].equals("/message")) {

                } else if (split[0].equals("/change")) {

                } else if (split[0].equals("/users")) {

                } else {

                }


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void enterChatprogram(String name, DataOutputStream output) throws IOException {
        output.writeUTF(name);

    }
}
