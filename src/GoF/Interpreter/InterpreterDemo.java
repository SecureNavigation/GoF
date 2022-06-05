package GoF.Interpreter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:38
 * @Version 1.0
 */
public class InterpreterDemo {

    //  规则： robert和john 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    //  规则：julie是一个已婚的女性
    public static Expression getFemaleExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getFemaleExpression();
        System.out.println("John is male?" + isMale.interpret("John"));
        System.out.println("Julie is a married women?" + isMarriedWoman.interpret("Married Julie"));
    }

    /**
     * John is male?true
     * Julie is a married women?true
     */
}
