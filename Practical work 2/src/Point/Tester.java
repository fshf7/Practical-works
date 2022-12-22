package Point;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of objects: ");
        int el = scan.nextInt();
        Circle[] array = new Circle[el];

        for (int i = 0; i < el; i++) {
            array[i] = (new Circle(random.nextInt(20),
                    random.nextInt(20), random.nextDouble(40)));
        }

        System.out.println("Created circle:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ".");
            System.out.println(array[i]);
        }

    }
}
