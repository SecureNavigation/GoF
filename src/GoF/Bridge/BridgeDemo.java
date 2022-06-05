package GoF.Bridge;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:02
 * @Version 1.0
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Circle redcircle = new Circle(new RedCircle(), 100, 100, 10);
        Circle greencircle = new Circle(new GreenCircle(), 100, 100, 10);

        redcircle.draw();
        greencircle.draw();

    }
    /**
     * Drawing Circle [ color : red, radius: 10, x: 100, y: 100
     * Drawing Circle [ color : green, radius: 10, x: 100, y: 100
     */
}
