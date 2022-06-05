package GoF.Decorator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:47
 * @Version 1.0
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCricle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRentangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCricle.draw();

        System.out.println("\nRentangle of red border");
        redRentangle.draw();
    }
}
/**
 * Circle with normal border
 * Shape::Circle::draw()
 *
 * Circle of red border
 * Shape::Circle::draw()
 * Border Color:Red
 *
 * Rentangle of red border
 * Shape::Rectangle::draw()
 * Border Color:Red
 */
