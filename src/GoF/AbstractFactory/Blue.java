package GoF.AbstractFactory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:44
 * @Version 1.0
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Blue::fill()");
    }
}
