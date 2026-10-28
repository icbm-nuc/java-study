package generic;

public class BoxMain1 {

    static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //타입 안정성이 매우 높음
        //코드 재사용은 매우 낮음
    }
}
