package GoF.Command;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:25
 * @Version 1.0
 */
public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
