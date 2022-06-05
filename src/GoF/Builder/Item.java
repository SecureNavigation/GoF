package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:00
 * @Version 1.0
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
