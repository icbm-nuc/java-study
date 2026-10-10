package lang.test.ex319p_13_14;

public class Oval implements Shape{
    private int radius1;
    private int radius2;

    public Oval(int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public void draw() {

        System.out.println(radius1 + "x" + radius2 + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        double area = radius1 * radius2 * Shape.PI;
        return area;
    }
}
