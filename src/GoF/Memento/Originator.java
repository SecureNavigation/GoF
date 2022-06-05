package GoF.Memento;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:10
 * @Version 1.0
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
