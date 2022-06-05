package GoF.Observer;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:32
 * @Version 1.0
 */
public class ObsrverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change : 15");
        subject.setState(15);
        System.out.println("Second state change : 10");
        subject.setState(10);
    }

    /**
     * First state change : 15
     * Hex String : F
     * Octal String : 15
     * Binary String : 1111
     * Second state change : 10
     * Hex String : A
     * Octal String : 10
     * Binary String : 1010
     */
}
