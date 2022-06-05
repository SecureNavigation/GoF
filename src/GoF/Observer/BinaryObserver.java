package GoF.Observer;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:27
 * @Version 1.0
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));
    }
}
