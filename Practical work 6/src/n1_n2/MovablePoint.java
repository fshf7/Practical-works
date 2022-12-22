package n1_n2;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint() {}

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int moveUp() { return this.y = this.y + this.ySpeed; }
    public int moveLeft() { return this.x = this.x-this.xSpeed; }
    public int moveRight() { return this.x = this.x+ this.xSpeed; }
    public int moveDown() { return this.y = this.y-this.ySpeed; }

    @Override
    public String toString() { return "X: " + this.x + "; Y: " + this.y; }
}
