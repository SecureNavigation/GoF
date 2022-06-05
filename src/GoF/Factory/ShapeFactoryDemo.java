package GoF.Factory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:35
 * @Version 1.0
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape ciRcle = shapeFactory.getShape("CIRcle");
        ciRcle.draw();

        Shape RECTANGLE = shapeFactory.getShape("RECTANGLE");
        RECTANGLE.draw();

        Shape SQUARE = shapeFactory.getShape("SQUARE");
        SQUARE.draw();
    }

    /**
     * Circle::draw()
     * Rectangle::draw()
     * Square::draw()
     */
}
