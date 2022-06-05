package GoF.Factory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:32
 * @Version 1.0
 */


/**
 * 创建工厂，生成基于给定信息的实体类对象
 * 优点：
 *      创建对象只需要知道名称
 *      扩展性高，添加产品只需扩展一个工厂类
 *      屏蔽产品的具体实现，只关心产品的接口
 * 缺点：
 *      每次增加产品，都需要增加一个具体类和对象实现工厂，使得系统类的个数成倍增加
 */

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
