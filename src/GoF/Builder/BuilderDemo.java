package GoF.Builder;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 15:16
 * @Version 1.0
 */
public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("VegMeal builder");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NonVegMeal builder");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }
    /**
     * VegMeal builder
     * Item: Veg Burger,Packing: Go.Builder.Recangle@6e0be858,Price: 25.0
     * Item: Coke,Packing: Go.Builder.Circle@61bbe9ba,Price: 3.0
     * Total Cost: 28.0
     * NonVegMeal builder
     * Item: Chicken Burger,Packing: Go.Builder.Recangle@610455d6,Price: 50.0
     * Item: Pepsi,Packing: Go.Builder.Circle@511d50c0,Price: 4.0
     * Total Cost: 54.0
     */
}
