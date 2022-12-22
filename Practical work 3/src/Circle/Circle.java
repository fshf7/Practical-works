package Circle;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class Circle extends Point{
    private double radius = 0.0;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "X: " + super.getX() + "\n" +
                "Y: " + super.getY() + "\n" +
                "R: " + radius + "\n";
    }

    public double getRadius() {
        return radius;
    }

    public static Circle getSmallCircle(Circle @NotNull []  array){
        Circle smallCircle = array[0];
        for (Circle circle : array) {
            if (circle.getRadius() < smallCircle.getRadius()) {
                smallCircle = circle;
            }
        }
        return smallCircle;
    }

    public static Circle getBigCircle(Circle @NotNull [] array){
        Circle bigCircle = array[0];
        for (Circle circle : array) {
            if (circle.getRadius() > bigCircle.getRadius()) {
                bigCircle = circle;
            }
        }
        return bigCircle;
    }

    public static void sortByRadius(Circle[] array){
        Arrays.sort(array, Comparator.comparing(Circle::getRadius));
        for (Circle circle : array) {
            System.out.println(circle);
        }
    }

}
