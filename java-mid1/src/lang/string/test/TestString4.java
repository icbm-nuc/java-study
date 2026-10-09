package lang.string.test;

public class TestString4 {

    static void main(String[] args) {
        String str = "hello.txt";
        String substr1 = str.substring(0,5 );
        String substr2 = str.substring(5,9);

        System.out.println(substr1);
        System.out.println(substr2);
    }
}
