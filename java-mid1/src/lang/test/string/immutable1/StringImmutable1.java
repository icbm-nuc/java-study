package lang.test.string.immutable1;

/**
 * String 은 불변 클래스
 * 반환도 클래스를 반환하므로 값을 받지 않으면 값이 없어짐
 */
public class StringImmutable1 {
    static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java!");
        //
        System.out.println("hello.concat(java) : " + str2);
    }

}
