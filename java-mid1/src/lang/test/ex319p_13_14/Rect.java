package lang.test.ex319p_13_14;

public class Rect implements Shape{
    private int weidth;

    private int height;
    public Rect(int weidth, int height) {
        this.weidth = weidth;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(weidth + "x" + height + "크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return weidth * height;
    }
}
