package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:07
 * @Version 1.0
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
