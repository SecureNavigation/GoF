package GoF.Mediator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:04
 * @Version 1.0
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("I am Robert");
        john.sendMessage("Hi , Robert");
    }
}
/*
Wed Jun 01 10:05:53 CST 2022 [Robert ] : I am Robert
Wed Jun 01 10:05:53 CST 2022 [John ] : Hi , Robert
 */
