package lang.test.string.equals;

public class StringEqualsMain1 {

    static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("string == 비교 : " + (str1 == str2));
        System.out.println("string equals 비교 : " + str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("string == 비교 : " + (str3 == str4));
        // string pool 에서 같은 문자는 꺼내씀 그래서 == 로도 true 가 나옴
        System.out.println("string equals 비교 : " + str3.equals(str4));
    }
}
