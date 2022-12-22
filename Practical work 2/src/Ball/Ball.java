package Ball;

class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDsp, double yDsp){
        x += xDsp;
        y += yDsp;
    }

    @Override
    public String toString() {
        return "Ball.Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
