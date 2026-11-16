package io.buffered;

public class BufferedConst {
    public static final String FILE_NAME = "temp/buffered.dat";
    public static final int FILE_SIZE = 10 * 1024 * 1024; //10MB
    public static int BUFFER_SIZE = 100000;

    //버퍼의 크기가 커진다고 해서 속도가 계속 줄어들지는 않음
    //디스크나 파일 시스템에서 데이터를 읽고 쓰는 기본단위가 4KB or 8KB 이기 때문
    //결국 버퍼에 많은 데이터를 담아서 보내도 디스크나 파일 시스템에서 해당 단위로 나누어 저장하기 때문에 효율에는 한계가 있음
}
