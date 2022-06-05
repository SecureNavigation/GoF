package GoF.AbstractFactory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:31
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
