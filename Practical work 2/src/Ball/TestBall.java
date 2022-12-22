package Ball;

import Ball.Ball;

class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(100.0, 100.0);
        System.out.println(b);

        b.move(30.0,15.0);
        System.out.println(b);
    }
}
