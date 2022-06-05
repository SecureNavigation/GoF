package GoF.Proxy;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 21:23
 * @Version 1.0
 */

/**
 * 代理模式：为其他对象提供一种代理以控制这个对象的访问
 * 优点：
 *      职责清晰
 *      高扩展性
 *      智能化
 * 缺点：
 *      代理模式可能会造成处理速度慢
 *      代理模式实现需要额外的工作
 *
 */
public class ProxyImage implements Image{
    private ReadImage readImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (readImage == null){
            readImage = new ReadImage(filename);
        }
        readImage.display();
    }
}
