package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:13
 * @Version 1.0
 */

/**
 * 建造者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
 *
 * 优点：
 *      建造者独立，易扩展
 *      便于控制细节风险
 *
 * 缺点：
 *      产品必须有共同点，范围有限制
 *      如果内部变化复杂，会有很多的建造类
 */

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
