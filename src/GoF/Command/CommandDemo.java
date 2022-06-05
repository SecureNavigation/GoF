package GoF.Command;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:28
 * @Version 1.0
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
    /**
     * Stock [ name='ABC', quantity=10] bought
     * Stock [ name='ABC', quantity=10] sold
     */
}
