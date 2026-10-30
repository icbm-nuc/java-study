package generic.ex5;

public class EraserBox <T> {

    public boolean instanceCheck(Object param) {
        //return param instanceof T;

        //런타임시에
        //return param instanceof Object 로 변경됨
        //항상 true 반환하게됨

        return false;
    }

    public void create() {
        //return new T(); // 오류
        //return new Object();
    }
}
