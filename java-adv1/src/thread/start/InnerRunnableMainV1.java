package thread.start;

import util.MyLogger;

import static util.MyLogger.*;

public class InnerRunnableMainV1 {

    static void main(String[] args) {
        log("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }
//특정 클래스에서만 사용시 정적 중첩클래스으로 Runnable 사용
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
