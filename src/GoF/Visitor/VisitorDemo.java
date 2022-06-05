package GoF.Visitor;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 14:33
 * @Version 1.0
 */
public class VisitorDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
    /**
     * displaying monitor.
     * displaying keyboard.
     * displaying mouse.
     * displaying computer.
     */
}
