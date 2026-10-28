package lang.test.immutable;

public class MutableMain1 {

    static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(10);
        System.out.println("obj = " + obj.getValue());
    }
}
