package GoF.Proxy;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 21:25
 * @Version 1.0
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("po.jpg");
        //  图像从磁盘加载
        image.display();
        System.out.println("");
        //  图像不需要从磁盘加载
        image.display();
    }

    /**
     * Loading po.jpg
     * Dusplaying po.jpg
     *
     * Dusplaying po.jpg
     */
}
