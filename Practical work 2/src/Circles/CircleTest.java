package Circles;

import Circles.Circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r, secondR;
        Circle circle = new Circle();
        System.out.println("Enter the radius of the first circle: ");
        r = scan.nextDouble();
        circle.setR(r);
        System.out.println("Length: " + circle.getL());
        System.out.println("Square: " + circle.getS());
        System.out.println("Enter the radius of the second circle: ");
        secondR = scan.nextDouble();
        circle.setR(secondR);
        System.out.println("Length: " + circle.getL());
        System.out.println("Square: " + circle.getS());
        circle.circlesEquality(r, secondR);
    }
}
