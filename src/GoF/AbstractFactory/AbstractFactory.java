package GoF.AbstractFactory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:45
 * @Version 1.0
 */

/**
 * 创建抽象工厂，生成基于给定信息的实体类对象
 * 优点：
 *      当一个产品族中的多个对象一起工作时，保证只使用同一个产品族的对象
 *
 * 缺点：
 *      产品族扩展困难，需要增加一个系列的某一种产品时，既要在Creator中增加代码，还要添加具体类
 */

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
