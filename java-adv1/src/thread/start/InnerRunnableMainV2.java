package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV2 {

    static void main(String[] args) {
        log("main() start");
//익명 클래스로 Runnable 사용 / 특정 메서드에서만 사용시
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }
}
