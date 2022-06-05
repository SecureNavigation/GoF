package GoF.Template;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:25
 * @Version 1.0
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started! Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
