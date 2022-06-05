package GoF.Strategy;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:15
 * @Version 1.0
 */

/**
 * 策略模式：定义一系列的算法，把它们一个个封装起来，并且使它们可以相互替换
 * 优点：
 *      算法可以自由切换
 *      避免使用多重条件判断
 *      扩展性好
 *
 * 缺点：
 *      策略类会增多
 *      所有策略类都需要向外暴露
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
