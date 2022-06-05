package GoF.Template;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:23
 * @Version 1.0
 */
public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Started! Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
