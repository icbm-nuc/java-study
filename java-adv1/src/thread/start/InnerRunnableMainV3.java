package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV3 {

    static void main(String[] args) {
        log("main() start");

// 람다로 Runnable 구현
        Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }
}
