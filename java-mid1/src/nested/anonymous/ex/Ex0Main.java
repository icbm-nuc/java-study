package nested.anonymous.ex;

public class Ex0Main {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println(str);
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
