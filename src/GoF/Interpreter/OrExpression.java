package GoF.Interpreter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:35
 * @Version 1.0
 */
public class OrExpression implements Expression{
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
