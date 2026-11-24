package network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConnectTimeoutMain2 {

    static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        try {
            //소캣 생성시 인자 전달안하면 객체만 생성 연결 x
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("192.168.1.250",45678),1000);
        } catch (ConnectException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("end = " + (end - start));
    }
}
