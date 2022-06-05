package GoF.Template;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 11:25
 * @Version 1.0
 */
public class TemplateDemo {
    public static void main(String[] args) {
        Game basketball = new Basketball();
        basketball.play();
        System.out.println();

        Game football = new Football();
        football.play();
    }
}
/**
 * Basketball Game Initialized! Start playing.
 * Basketball Game Started! Enjoy the game
 * Basketball Game Finished!
 *
 * Football Game Initialized! Start playing.
 * Football Game Started! Enjoy the game
 * Football Game Finished!
 */
