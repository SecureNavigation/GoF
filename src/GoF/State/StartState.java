package GoF.State;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:43
 * @Version 1.0
 */


/**
 * 状态模式：允许对象在内部状态发生
 * 优点：
 *      封装了转换规则
 *      枚举可能的状态
 *      将所有与对象相关的状态放到一个类中，可以方便增加新的状态，只需改变对象状态即可改变对象的行为
 *      允许状态转换逻辑与状态对象合成一体
 *      可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数
 * 缺点：
 *      状态模式的使用必然增加系统类和对象的个数
 *      状态模式的结构和实现较复杂
 *      对开闭原则支持不太好
 *
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
