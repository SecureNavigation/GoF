package GoF.Visitor;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 14:32
 * @Version 1.0
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("displaying computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("displaying mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("displaying keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("displaying monitor.");
    }
}
