package GoF.State;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:45
 * @Version 1.0
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
    /**
     * Player is in start state
     * Start State
     * Player is in stop state
     * Stop State
     */
}
