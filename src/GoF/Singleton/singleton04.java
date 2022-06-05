package GoF.Singleton;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/5 21:52
 * @Version 1.0
 */
public class singleton04 {

    /**
     * 双重检测锁
     * 使用时加载，线程安全，效率高
     */
    private static singleton04 singleton04;
    private singleton04(){};

    public static singleton04 getSingleton04() {

        if (singleton04 == null){
            synchronized (singleton04.class){
                if (singleton04 == null)
                    singleton04 = new singleton04();
            }
        }
        return singleton04;
    }
}
