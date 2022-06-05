package GoF.Adapter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 16:12
 * @Version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: "+filename);
    }
}
