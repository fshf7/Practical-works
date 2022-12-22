package Random;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = scan.nextInt();
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble(100 + 100) - 100;
            System.out.printf("%.2f  ", array[i]);
        }

        System.out.println("\n\nEnter the number of elements in 2nd array: ");
        n = scan.nextInt();
        double[] array1 = new double[n];

        for (int i = 0; i < n; i++) {
            array1[i] = (Math.random() * (100 + 100) - 100);
            System.out.printf("%.2f  ", array1[i]);
        }

        System.out.println("\n\nFirst array is sorted: ");
        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f  ", array[i]);
        }

        System.out.println("\n\nSecond array is sorted: ");
        Arrays.sort(array1);
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f  ", array1[i]);
        }
    }
}