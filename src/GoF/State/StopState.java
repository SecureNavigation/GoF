package GoF.State;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:44
 * @Version 1.0
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }
}
