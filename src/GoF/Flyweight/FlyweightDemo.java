package GoF.Flyweight;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 21:07
 * @Version 1.0
 */
public class FlyweightDemo {
    private static final String[] colors = {"Red","Green","Blue","White","Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int) (Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int) (Math.random()*100);
    }

    private static int getRandomY(){
        return (int) (Math.random()*100);
    }

    /**
     * Creating circle of color : Black
     * Circle::draw() [ Color : Black, x: 57, y: 60, radius: 100 ]
     * Creating circle of color : Green
     * Circle::draw() [ Color : Green, x: 50, y: 88, radius: 100 ]
     * Creating circle of color : Red
     * Circle::draw() [ Color : Red, x: 34, y: 54, radius: 100 ]
     * Circle::draw() [ Color : Red, x: 94, y: 80, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 27, y: 98, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 31, y: 32, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 66, y: 37, radius: 100 ]
     * Creating circle of color : Blue
     * Circle::draw() [ Color : Blue, x: 11, y: 84, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 89, y: 21, radius: 100 ]
     * Circle::draw() [ Color : Red, x: 59, y: 98, radius: 100 ]
     * Creating circle of color : White
     * Circle::draw() [ Color : White, x: 69, y: 68, radius: 100 ]
     * Circle::draw() [ Color : Blue, x: 72, y: 62, radius: 100 ]
     * Circle::draw() [ Color : Blue, x: 45, y: 59, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 79, y: 10, radius: 100 ]
     * Circle::draw() [ Color : Red, x: 28, y: 16, radius: 100 ]
     * Circle::draw() [ Color : Black, x: 95, y: 37, radius: 100 ]
     * Circle::draw() [ Color : Blue, x: 58, y: 75, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 31, y: 0, radius: 100 ]
     * Circle::draw() [ Color : Green, x: 36, y: 98, radius: 100 ]
     * Circle::draw() [ Color : Blue, x: 5, y: 6, radius: 100 ]
     */


}


