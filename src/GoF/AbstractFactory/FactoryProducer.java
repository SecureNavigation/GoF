package GoF.AbstractFactory;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 14:48
 * @Version 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice == null){
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
