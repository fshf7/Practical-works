package Circle;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of objects: ");
        int el = scan.nextInt();
        Circle[] arr = new Circle[el];

        for (int i = 0; i < el; i++) {
            arr[i] = (new Circle(random.nextInt(20 + 20) - 20, random.nextInt(20 + 20) - 20, random.nextInt(40)));
        }

        System.out.println("Created circle:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ".");
            System.out.println(arr[i]);
        }

        System.out.println("The smallest circle is:\n" + Circle.getSmallCircle(arr));
        System.out.println("The biggest circle is:\n" + Circle.getBigCircle(arr));
        Circle.sortByRadius(arr);
    }
}
