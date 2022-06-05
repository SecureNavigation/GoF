package GoF.Singleton;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/5 21:44
 * @Version 1.0
 */
public class singleton01 {
    /**
     * 饿汉式
     * 线程安全
     * 效率不高：加载时初始化
     */
    private static singleton01 SINGLETON_01 = new singleton01();

    private singleton01(){

    }

    public static singleton01 getSingleton01() {
        return SINGLETON_01;
    }

    /**
     * 静态代码块初始化
     */

    private static singleton01 SINGLETON_02;
    static {
        SINGLETON_02 = new singleton01();
    }

    public static singleton01 getSingleton01_2() {
        return SINGLETON_02;
    }
}
