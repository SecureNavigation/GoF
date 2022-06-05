package GoF.Prototype;

import java.util.Hashtable;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:40
 * @Version 1.0
 */


/**
 * 原型模式：使用原型实例指定创建对象的种类，并且通过clone这些原型创建新的对象
 *
 * 优点：
 *      性能高
 *      逃避构造函数的约束
 * 缺点：
 *      必须实现Cloneable接口
 *      配备clone方法需要对类的功能进行通盘考虑，全新的类较易，已有的类较难，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候
 *
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     */
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }
}
