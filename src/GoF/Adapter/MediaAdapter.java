package GoF.Adapter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 16:54
 * @Version 1.0
 */

/**
 * 适配器模式：将一个类的接口转换成客户希望的另一个接口
 *
 * 优点：
 *      可以让两个没有关联的类一起运行
 *      提高了类的复用
 *      增加了类的透明度
 *      灵活性好
 * 缺点：
 *      过多的使用适配器，会让系统零乱
 *      至多只能适配一个适配者类，而且目标类必须是抽象类
 */

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
