package nested.inner;

public class InnerOuterMain {

    static void main() {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass() = " + inner.getClass());
    }
}
