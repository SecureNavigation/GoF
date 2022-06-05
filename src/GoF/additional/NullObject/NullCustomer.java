package GoF.additional.NullObject;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:06
 * @Version 1.0
 */

/**
 * 空对象模式：用一个空对象取代NULL对象实例的检查
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Data";
    }
}
