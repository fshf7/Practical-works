package n5;

import java.util.Scanner;

public class Main {
    public static int recursion(int n)
    {
        if(n > 0) return n % 10 + recursion(n / 10);
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursion(n));
    }
}
