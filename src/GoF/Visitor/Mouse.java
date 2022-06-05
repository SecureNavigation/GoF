package GoF.Visitor;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 14:28
 * @Version 1.0
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
