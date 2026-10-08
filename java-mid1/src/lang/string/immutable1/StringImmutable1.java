package lang.string.immutable1;

public class StringImmutable1 {

    static void main(String[] args) {
        //string 은 불변객체
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
