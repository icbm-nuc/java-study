package poly.basic;

public class CastingMain1 {

    static void main(String[] args) {
        //다형적 참조
        Parent poly = new Child();
        //단 자식의 기능은 호출 X
        //poly.chilldMethod();

        //다운캐스팅(부모 타입 -> 자식 타입 )
        Child child = (Child) poly; // x001;
        child.childMethod();

    }
}
