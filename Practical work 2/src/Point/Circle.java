package Point;

public class Circle extends Point {
    private double radius;
    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = 1.0;
    }

    @Override
    public String toString() {
        return "X: " + super.getX() + "\n" +
                "Y: " + super.getY() + "\n" +
                "R: " + radius + "\n";
    }
}
