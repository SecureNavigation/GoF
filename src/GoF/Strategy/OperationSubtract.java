package GoF.Strategy;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:14
 * @Version 1.0
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
