package generic.ex1;

public class BoxMain3 {

    static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
//        GenericBox<Integer> integerBox = new GenericBox<>(); // 생략가능
        integerBox.set(10);
//        integerBox.set("문자1000") Integer타입만 허용 , 컴파일 요류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
//        GenericBox<> integerBox2 = new GenericBox<Integer>(); // 불가능

    }
}
