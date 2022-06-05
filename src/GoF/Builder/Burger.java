package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:03
 * @Version 1.0
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Recangle();
    }

    @Override
    public abstract float price();
}
