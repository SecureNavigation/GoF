package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:08
 * @Version 1.0
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 4.0f;
    }
}
