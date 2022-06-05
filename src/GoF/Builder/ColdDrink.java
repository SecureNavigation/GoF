package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:05
 * @Version 1.0
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Circle();
    }

    @Override
    public abstract float price();
}
