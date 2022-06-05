package GoF.Flyweight;

import java.util.HashMap;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 21:00
 * @Version 1.0
 */

/**
 * 享元模式：运用共享技术有效地支持大量细粒度的对象
 * 优点：
 *      减少了对象的创建
 * 缺点：
 *      提高了系统的复杂性
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : "+ color);
        }
        return circle;
    }

}
