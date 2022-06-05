package GoF.Prototype;

import Go.Prototype.Shape;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:31
 * @Version 1.0
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
