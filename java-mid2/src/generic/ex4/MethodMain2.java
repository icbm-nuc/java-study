package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    static void main(String[] args) {
        Dog dog  = new Dog("멍멍이", 100);
        Cat cat  = new Cat("멍멍이", 100);

        //제네릭메서드 자동 추론
        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);

    }
}
