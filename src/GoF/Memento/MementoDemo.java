package GoF.Memento;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 10:13
 * @Version 1.0
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateMemento());
        originator.setState("State #4");

        System.out.println("Current State : " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State : "+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State : "+originator.getState());

    }
    /**
     * Current State : State #4
     * First saved State : State #2
     * Second saved State : State #3
     */
}
