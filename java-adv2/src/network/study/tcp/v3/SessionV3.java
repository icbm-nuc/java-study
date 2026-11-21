package network.study.tcp.v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import static util.MyLogger.log;

public class SessionV3 implements Runnable{

    private final Socket socket;

    public SessionV3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
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

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
