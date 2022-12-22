package n2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
