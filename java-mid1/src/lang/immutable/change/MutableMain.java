package lang.immutable.change;

public class MutableMain {

    static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);
        System.out.println("obj = " + obj.getValue());
    }
}
