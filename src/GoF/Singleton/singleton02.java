package GoF.Singleton;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/5 21:48
 * @Version 1.0
 */
public class singleton02 {
    /**
     * 懒汉式
     * 效率高：使用时加载
     * 线程不安全
     */
    private static singleton02 singleton02;
    private singleton02(){};

    public static singleton02 getSingleton02() {
        if (singleton02 == null)
            singleton02 = new singleton02();
        return singleton02;
    }
}
