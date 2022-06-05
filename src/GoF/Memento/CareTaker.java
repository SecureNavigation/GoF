package GoF.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:12
 * @Version 1.0
 */

/**
 * 备忘录模式：在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
 * 优点：
 *      提供一种可以恢复状态的机制
 *      实现了信息的封装
 * 缺点：
 *      消耗资源，如果类的成员变量过多，占用内存较大，每次保存都会耗费内存
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
