package network.chat;

import java.io.DataInputStream;
import java.io.IOException;

import static util.MyLogger.log;

public class Reader implements Runnable{

    private final DataInputStream input;

    public Reader(DataInputStream input) {
        this.input = input;
    }

    @Override
    public void run() {
        try {
            String received = input.readUTF();
            log("받은 메시지 : " + received);

        } catch (IOException e) {
            log("수신종료");
        }
    }

}
