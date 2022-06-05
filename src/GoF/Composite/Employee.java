package GoF.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:31
 * @Version 1.0
 */

/**
 * 将对象组合成树形结构表示“部分-整体”的层次结构
 *
 * 优点：
 *      高层模块调用简单
 *      节点自由添加
 *
 * 缺点：
 *      叶子和树枝的声明都是实现类，而不是接口，违背了依赖倒置原则
 */

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
