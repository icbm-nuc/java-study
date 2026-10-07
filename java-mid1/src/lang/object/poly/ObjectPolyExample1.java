package lang.object.poly;

public class ObjectPolyExample1 {

    static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); // 컴파일 오류 ,Object 는 sound()  가 없음

        if(obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
