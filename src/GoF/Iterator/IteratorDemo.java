package GoF.Iterator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/6/1 9:53
 * @Version 1.0
 */
public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getInterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
/**
 * Name : Robert
 * Name : John
 * Name : Julie
 * Name : Lora
 */
