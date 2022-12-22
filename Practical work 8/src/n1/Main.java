package n1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k = 1;
        n = sc.nextInt();
        int sum = n*(n+1)/2;
        for (int i = 1; i < sum + 1; i++)
        {
            System.out.print(k + " ");
            if (i == k * (k + 1) / 2) k++;
        }
    }
}
