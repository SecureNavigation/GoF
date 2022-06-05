package GoF.Chain;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:09
 * @Version 1.0
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File :: Logger: "+message);
    }
}
