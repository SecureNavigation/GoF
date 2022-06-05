package GoF.Mediator;

import java.util.Date;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:01
 * @Version 1.0
 */

/**
 * 中介者模式：通过一个中介对象来封装一系列的对象交互
 * 优点：
 *      降低了类的复杂性，将一对多转化成一对一
 *      各个类之间的解耦
 *      符号迪米特法则
 * 缺点：
 *      中介者会庞大，变得难以维护
 *
 */
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + " ["+ user.getName() + " ] : " + message);
    }
}
