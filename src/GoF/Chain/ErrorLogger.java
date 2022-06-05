package GoF.Chain;

import java.io.Console;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:08
 * @Version 1.0
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console:: Logger: "+message);
    }
}
