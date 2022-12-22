package n1_n2;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public int moveUp() { center.moveUp();
        return 0;
    }
    public int moveLeft() { center.moveLeft();
        return 0;
    }
    public int moveRight() { center.moveRight();
        return 0;
    }
    public int moveDown() { center.moveDown();
        return 0;
    }
}
