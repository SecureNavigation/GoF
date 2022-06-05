package GoF.Decorator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:44
 * @Version 1.0
 */

/**
 * 动态的给一个对象添加一些额外的职责
 *
 * 优点：
 *      装饰器和装饰器类可以独立，不会相互耦合，是继承的一个替代模式
 * 缺点：
 *      多层装饰比较复杂
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
