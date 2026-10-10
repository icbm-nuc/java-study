package lang.test.ex319p_13_14;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;

    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius+"인 원입니다.");
    }

    @Override
    public double getArea() {
        double area = radius * radius * Shape.PI;
        return area;
    }
}
