package GoF.Singleton;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/5 21:48
 * @Version 1.0
 */
public class singleton03 {
    /**
     * 懒汉式
     * 使用时加载,线程安全
     * 效率低：加锁
     */
    private static singleton03 singleton03;
    private singleton03(){};

    /**
     * 方法体加锁
     * @return
     */
    public static synchronized singleton03 getSingleton03() {
        if (singleton03 == null)
            singleton03 = new singleton03();
        return singleton03;
    }


    /**
     * 方法内加锁
     * @return
     */
    public static singleton03 getSingleton03_2() {
        synchronized (singleton03.class){
            if (singleton03 == null)
                singleton03 = new singleton03();
        }
        return singleton03;
    }
}
