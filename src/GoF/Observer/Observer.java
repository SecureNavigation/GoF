package GoF.Observer;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:24
 * @Version 1.0
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
