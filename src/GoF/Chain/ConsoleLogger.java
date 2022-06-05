package GoF.Chain;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:06
 * @Version 1.0
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console :: Logger: "+message);
    }
}
