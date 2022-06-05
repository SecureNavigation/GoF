package GoF.Chain;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:10
 * @Version 1.0
 */


/**
 * 责任链模式：处理请求，沿着责任链传递请求
 *
 * 优点：
 *      降低耦合度
 *      简化了对象
 *      增强给对象指派责任的灵活性
 *      增加新的请求处理类很方便
 *
 *  缺点：
 *      不能保证请求一定被接受
 *      系统性能受到一定影响，可能造成循环调用
 *      不易观察运行状态
 */
public class ChainDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();

        chainOfLoggers.logMessage(AbstractLogger.INFO,"This is an information.");
        chainOfLoggers.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        chainOfLoggers.logMessage(AbstractLogger.ERROR,"This is an error information.");

    }

    /**
     * Standard Console :: Logger: This is an information.
     * File :: Logger: This is a debug level information.
     * Standard Console :: Logger: This is a debug level information.
     * Error Console:: Logger: This is an error information.
     * File :: Logger: This is an error information.
     * Standard Console :: Logger: This is an error information.
     */
}
