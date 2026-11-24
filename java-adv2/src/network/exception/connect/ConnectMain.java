package network.exception.connect;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectMain {

    static void main(String[] args) throws IOException {
        unknownHostEx1(); // ip 존재안할때
        unknownHostEx2();
        connectionRefused(); // 연결 거절
    }

    private static void unknownHostEx2() throws IOException{
        try {
            Socket socket = new Socket("google.gogo", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void connectionRefused() {
        try {
            Socket socket = new Socket("localhost", 45678);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void unknownHostEx1() throws IOException{
        try {
            Socket socket = new Socket("999.999.999.999", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
