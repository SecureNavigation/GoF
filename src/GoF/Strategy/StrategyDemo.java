package GoF.Strategy;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:17
 * @Version 1.0
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));
    }
    /**
     * 10 + 5 = 15
     * 10 - 5 = 5
     * 10 * 5 = 50
     */
}
