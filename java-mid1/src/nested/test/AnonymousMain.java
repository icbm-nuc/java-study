package nested.test;

public class AnonymousMain {

    static void main(String[] args) {

        Hello hello = new Hello() {
            @Override
            public void Hello() {
                System.out.println("Hello.hello");
            }
        };

        hello.Hello();
    }
}
