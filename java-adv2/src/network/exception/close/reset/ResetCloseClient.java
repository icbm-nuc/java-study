package network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static util.MyLogger.log;

public class ResetCloseClient {

    static void main(String[] args) throws InterruptedException, IOException {
        Socket socket = new Socket("localhost", 12345);
        log("소캣 연결: " + socket);
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        // client <- server : FIN
        Thread.sleep(1000);

        // client -> server : PUSH[1]
        output.write(1);

        // client <- server: RST
        Thread.sleep(1000);


        try {
            //java.net.SocketException: Connection reset
            int read = input.read();
            System.out.println("read = " + read);
        } catch (SocketException e) {
            e.printStackTrace();
        }


        try {
            //java.net.SocketException: Broken pipe
            output.write(1);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
