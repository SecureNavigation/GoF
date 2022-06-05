package GoF.Adapter;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 17:00
 * @Version 1.0
 */
public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond.mp3");
        audioPlayer.play("vlc","far.vlc");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("avi","movie.avi");
    }
    /**
     * Playing mp3 file.Name: beyond.mp3
     * Playing vlc file. Name: far.vlc
     * Playing mp4 file. Name: alone.mp4
     * Invalid media. avi format not supported
     */
}
