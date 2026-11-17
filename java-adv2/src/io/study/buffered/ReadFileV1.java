package io.study.buffered;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.study.buffered.BufferedConst.*;


public class ReadFileV1 {

    static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int read;
        while ((read = fis.read()) != -1) {
            fileSize++;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("file name: " + FILE_NAME);
        System.out.println("file size: " + fileSize / 1024 / 1024 + "MB");
        System.out.println("소요 시간 : " + (endTime - startTime) + "ms");

    }
}
