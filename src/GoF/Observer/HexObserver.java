package GoF.Observer;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:30
 * @Version 1.0
 */
public class HexObserver extends Observer{
    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String : " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
