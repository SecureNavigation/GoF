package GoF.Interpreter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:34
 * @Version 1.0
 */

/**
 * 解释器模式：给定一个语言，定义它的文法表示，并定义一个解释器，使用该标识来解释语言中的句子
 *
 * 优点：
 *      可扩展性好
 *      增加了新的解释表达式的方式
 *      便于实现简单文法
 *
 * 缺点：
 *      可用场景少
 *      对复杂文法较难维护
 *      解释器模式会引起类膨胀
 *      采用了递归调用的方法
 */

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data))
            return true;
        return false;
    }
}
