package GoF.Memento;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:09
 * @Version 1.0
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
