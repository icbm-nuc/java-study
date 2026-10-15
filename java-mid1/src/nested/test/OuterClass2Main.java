package nested.test;

public class OuterClass2Main {

    static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.NestedClass nestedClass = outerClass2.new NestedClass();
        nestedClass.hello();
    }
}
