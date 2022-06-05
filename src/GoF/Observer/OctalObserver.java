package GoF.Observer;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:29
 * @Version 1.0
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal String : " + subject.getState());
    }
}
