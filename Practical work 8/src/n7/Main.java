package n7;

import java.util.Scanner;

public class Main {
    public static void req(int n, int k)
    {
        if(k > n / 2 | k > n/k)
        {
            System.out.println(1 + " " + n);
            return;
        }
        if(n % k == 0)
        {
            System.out.println(k + " " + n/k);
            req(n, k+1);
            return;
        }
        else req(n, k+1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        req(n,2);
    }
}
