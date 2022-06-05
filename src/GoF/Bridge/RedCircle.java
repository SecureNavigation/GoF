package GoF.Bridge;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 19:58
 * @Version 1.0
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color : red, radius: "+radius +", x: "+x + ", y: "+y);
    }
}
