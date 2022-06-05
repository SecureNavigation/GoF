package GoF.Visitor;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 14:24
 * @Version 1.0
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
