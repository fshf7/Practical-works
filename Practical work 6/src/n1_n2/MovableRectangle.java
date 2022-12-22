package n1_n2;

public class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public int moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
        return 0;
    }
    public int moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
        return 0;
    }
    public int moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
        return 0;
    }
    public int moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
        return 0;
    }
//    void are_x_y_speeds_equal(int xSpeed, int ySpeed){
//        if(xSpeed != ySpeed){
//            System.out.println("Change!");
//        }
//    }

    @Override
    public String toString() {
        return "Rectangle: topLeft point: " + topLeft.toString() +
                "; bottomRight point: " + bottomRight.toString();
    }
}
