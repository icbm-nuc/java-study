package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {

    static void main(String[] args) throws IOException, IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        byte[] input = {65,66,67,65,65,65,65,65,65,65,65};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] buffer = new byte[10];
        int resdCount = fis.read(buffer, 0, 10);
        System.out.println("resdCount = " + resdCount);
        System.out.println(Arrays.toString(buffer));
        fis.close();
    }
}
