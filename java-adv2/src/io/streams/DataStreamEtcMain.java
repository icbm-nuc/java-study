package io.streams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEtcMain {

    static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/data.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("회원A");
        dos.writeInt(20);
        dos.writeDouble(10.5);
        dos.writeBoolean(true);
        dos.close();

    }
}
