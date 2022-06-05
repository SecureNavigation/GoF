package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:06
 * @Version 1.0
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
