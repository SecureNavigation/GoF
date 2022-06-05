package GoF.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:26
 * @Version 1.0
 */

/**
 * 命令模式：将请求封装成一个对象，可以用不同的请求对客户参数化
 *
 * 优点：
 *      降低了系统的耦合性
 *      新的命令很容易添加
 * 缺点：
 *      导致系统有过多的具体命令类
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
