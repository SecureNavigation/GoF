package GoF.additional.NullObject;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:05
 * @Version 1.0
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
