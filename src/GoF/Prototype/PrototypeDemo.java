package GoF.Prototype;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:49
 * @Version 1.0
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: "+ clonedCircle.getType());

        Shape clonedRectangle = ShapeCache.getShape("2");
        System.out.println("Shape: "+ clonedRectangle.getType());

        Shape clonedSquare = ShapeCache.getShape("3");
        System.out.println("Shape: "+ clonedSquare.getType());
    }
    /**
     * Shape: Circle
     * Shape: Rectangle
     * Shape: Square
     */
}
