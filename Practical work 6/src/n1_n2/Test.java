package n1_n2;

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5,2,10,5);
        point.moveUp();
        point.moveLeft();
        System.out.println(point);
        MovablePoint circle = new MovableCircle(3,4,6,8);
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);
        MovablePoint rect = new MovableRectangle(8,2,9,6,2,7);
        rect.moveUp();
        rect.moveLeft();
        System.out.println(rect);
    }
}
