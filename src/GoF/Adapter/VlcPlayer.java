package GoF.Adapter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 16:11
 * @Version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: "+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
