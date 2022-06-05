package GoF.Proxy;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 21:22
 * @Version 1.0
 */
public class ReadImage implements Image{
    private String filename;

    public ReadImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Dusplaying "+filename);
    }

    private void loadFromDisk(String filename){
        System.out.println("Loading " + filename);
    }
}
