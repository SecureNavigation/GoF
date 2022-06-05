package GoF.Composite;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:33
 * @Version 1.0
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("john", "CEO", 30000);

        Employee headA = new Employee("A", "Head", 20000);
        Employee headB = new Employee("B", "Head", 20000);

        Employee clerkC = new Employee("C", "Marketing", 18000);
        Employee clerkD = new Employee("D", "Marketing", 18000);

        Employee salesE = new Employee("E", "Sales", 10000);
        Employee salesF = new Employee("F", "Sales", 10000);

        CEO.add(headA);
        CEO.add(headB);

        headA.add(clerkC);
        headA.add(clerkD);

        headB.add(salesE);
        headB.add(salesF);

        System.out.println(CEO);

        for (Employee headEmp:CEO.getSubordinates()){
            System.out.println(headEmp);
            for (Employee employee:headEmp.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
    /*
    Employee{name='john', dept='CEO', salary=30000}
Employee{name='A', dept='Head', salary=20000}
Employee{name='C', dept='Marketing', salary=18000}
Employee{name='D', dept='Marketing', salary=18000}
Employee{name='B', dept='Head', salary=20000}
Employee{name='E', dept='Sales', salary=10000}
Employee{name='F', dept='Sales', salary=10000}

     */
}
