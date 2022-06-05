package GoF.State;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:41
 * @Version 1.0
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
