package exception.basic.unchecked;

public class UncheckedCatchMain {

    static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
