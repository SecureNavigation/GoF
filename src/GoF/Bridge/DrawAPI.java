package GoF.Bridge;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 19:57
 * @Version 1.0
 */

/**
 * 桥接模式：将抽象部分与实现部分分离，使它们独立的变化
 *
 * 优点：
 *      抽象和实现的分离
 *      优秀的扩展能力
 *      实现细节对客户透明
 * 缺点：
 *      增加系统的理解和设计难度
 */

public interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}
