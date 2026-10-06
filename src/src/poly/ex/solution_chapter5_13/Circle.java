package poly.ex.solution_chapter5_13;

public class Circle implements Shape{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }

    @Override
    public void redraw() {
        Shape.super.redraw();

    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }


}
