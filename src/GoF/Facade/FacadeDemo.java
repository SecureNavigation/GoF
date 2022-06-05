package GoF.Facade;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:58
 * @Version 1.0
 */
public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

    /**
     * Circle::draw()
     * Rectangle::draw()
     * Square::draw()
     */
}
