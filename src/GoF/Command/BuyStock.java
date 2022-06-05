package GoF.Command;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:24
 * @Version 1.0
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
