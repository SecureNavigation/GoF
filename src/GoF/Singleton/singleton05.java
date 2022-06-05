package GoF.Singleton;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/5 21:58
 * @Version 1.0
 */
public class singleton05 {
    /**
     * 静态内部类
     * 使用时加载，线程安全，效率高
     */
    private static class Holder{
        private static final singleton05 singleton05 = new singleton05();
    }
    private singleton05(){};
    public static singleton05 getInstance(){
        return Holder.singleton05;
    }
}
