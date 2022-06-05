package GoF.Decorator;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:45
 * @Version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        seyRedBorder(decoratedShape);
    }

    private void seyRedBorder(Shape decoratedShape){
        System.out.println("Border Color:Red");
    }
}
