package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {
    static void main(String[] args) {
        Thread counter = new Thread(new CounterRunnable(),"counter");

        counter.start();

    }

    static class CounterRunnable implements Runnable{
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
    }

}
