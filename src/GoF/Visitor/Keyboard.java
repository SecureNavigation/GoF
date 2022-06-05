package GoF.Visitor;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 14:26
 * @Version 1.0
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
