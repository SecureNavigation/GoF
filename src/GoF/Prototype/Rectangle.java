package GoF.Prototype;

import Go.Prototype.Shape;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:30
 * @Version 1.0
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
