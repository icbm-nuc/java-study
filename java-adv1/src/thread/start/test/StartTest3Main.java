package thread.start.test;

import static util.MyLogger.log;

public class StartTest3Main {
    static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread counter = new Thread(runnable,"counter");

        counter.start();

    }

}
