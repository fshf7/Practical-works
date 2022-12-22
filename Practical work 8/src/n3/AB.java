package n3;

import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (int i = 0; i <= Math.abs(a-b); i++) {
            if (a < b) System.out.print((i + a) + " ");
            if (a > b) System.out.print((a - i) + " ");
        }
    }
}
