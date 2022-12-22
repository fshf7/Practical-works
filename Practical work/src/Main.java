import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r;

        Circle k1 = new Circle(3.1, 6.2, 5.3, "red");
        System.out.println("The length of the circle is: " + k1.getLength() + "sm");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = scan.nextDouble();
        k1.setR(r);
        System.out.println("The length of the circle is: " + k1.getLength() + "sm");
    }
}