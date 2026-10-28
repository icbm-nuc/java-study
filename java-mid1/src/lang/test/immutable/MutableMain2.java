package lang.test.immutable;

public class MutableMain2 {

    static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj obj2 = obj.add(10);
        System.out.println("obj = " + obj.getValue());
        System.out.println("obj = " + obj2.getValue());
    }
}
