package GoF.Template;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:22
 * @Version 1.0
 */

/**
 * 模板模式：定义一个算法的框架，将一些步骤延迟到子类中
 * 优点：
 *      封装不变部分，扩展可变部分
 *      提取公共代码，便于维护
 *      行为由父类控制，子类实现
 * 缺点：
 *      每一个不同的实现都需要一个子类来实现，导致类的个数增加
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //  模板
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
