package io.study.buffered;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * fos는 해당 파일 패스에 글자 입력
 * 시간이 많이 걸리는 이유는 os에 접근하는건 시간이 오래 걸리기 때문
 */
import static io.study.buffered.BufferedConst.*;

public class CreateFileV1 {

    static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < FILE_SIZE; i++) {
            fos.write(1);
        }
        fos.close();
        long endTime = System.currentTimeMillis();

        System.out.println("file name: " + FILE_NAME);
        System.out.println("file size: " + FILE_SIZE);
        System.out.println("소요 시간 : " + (endTime - startTime) + "ms");

    }
}
