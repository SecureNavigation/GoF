package GoF.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:21
 * @Version 1.0
 */

/**
 * 观察者模式：定义对象间的一种一对多的依赖关系，当一个对象的状态发送改变时，所有依赖于它的对象都得到通知并自动更新
 * 优点：
 *      观察者与被观察者是抽象耦合的
 *      建立一套触发机制
 * 缺点：
 *      通知所有花费时间
 *      如果观察者与被观察者之间有循环依赖，可能导致系统崩溃
 *      无法知道是怎么变化的，仅仅知道发生了变化
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
