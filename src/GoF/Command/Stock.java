package GoF.Command;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:22
 * @Version 1.0
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;


    public void buy() {
        System.out.println( "Stock [ " +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                "] bought");
    }

    public void sell() {
        System.out.println( "Stock [ " +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                "] sold");
    }
}
