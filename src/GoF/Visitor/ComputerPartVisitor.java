package GoF.Visitor;


/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 14:25
 * @Version 1.0
 */

/**
 * 访问者模式：将数据结构与数据操作分离
 * 优点：
 *      符合单一职责原则
 *      扩展性好
 *      灵活性好
 * 缺点：
 *      具体元素对访问者公布细节，违背迪米特法则
 *      具体元素变更困难
 *      违反了依赖倒置原则
 */

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
