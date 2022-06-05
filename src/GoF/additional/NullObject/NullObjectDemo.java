package GoF.additional.NullObject;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:09
 * @Version 1.0
 */
public class NullObjectDemo {
    public static void main(String[] args) {
        AbstractCustomer rob = CustomerFactory.getCustomer("Rob");
        AbstractCustomer bob = CustomerFactory.getCustomer("Bob");
        AbstractCustomer julie = CustomerFactory.getCustomer("Julie");
        AbstractCustomer laura = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers:");
        System.out.println(rob.getName());
        System.out.println(bob.getName());
        System.out.println(julie.getName());
        System.out.println(laura.getName());
    }
    /**
     * Customers:
     * Rob
     * Not Available in Customer Data
     * Julie
     * Not Available in Customer Data
     */
}
