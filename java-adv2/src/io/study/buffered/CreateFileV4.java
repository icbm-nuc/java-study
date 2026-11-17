package io.study.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.study.buffered.BufferedConst.*;

/**
 * fos는 해당 파일 패스에 글자 입력
 * 시간이 많이 걸리는 이유는 os에 접근하는건 시간이 오래 걸리기 때문
 * 버퍼 필요
 */

public class CreateFileV4 {

    static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);

        byte[] buffer = new byte[FILE_SIZE];
        long startTime = System.currentTimeMillis();


        for (int i = 0; i < FILE_SIZE; i++) {
            buffer[i] = 1;
        }
        fos.write(buffer);
        fos.close();
        long endTime = System.currentTimeMillis();

        System.out.println("file name: " + FILE_NAME);
        System.out.println("file size: " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("소요 시간 : " + (endTime - startTime) + "ms");

    }
}
