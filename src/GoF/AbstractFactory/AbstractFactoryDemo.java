package GoF.AbstractFactory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:51
 * @Version 1.0
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
        Color green = colorFactory.getColor("GREEN");
        green.fill();
    }
    /**
     * Circle::draw()
     * Rectangle::draw()
     * Square::draw()
     * Red::fill()
     * Blue::fill()
     * Green::fill()
     */
}
