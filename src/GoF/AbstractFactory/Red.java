package GoF.AbstractFactory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:43
 * @Version 1.0
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red::fill()");
    }
}
