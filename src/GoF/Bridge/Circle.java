package GoF.Bridge;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:01
 * @Version 1.0
 */
public class Circle extends Shape{
    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
