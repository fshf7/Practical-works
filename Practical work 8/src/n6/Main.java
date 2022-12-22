package n6;

import java.util.Scanner;

public class Main {
    public static boolean prost(int n, int i)
    {
        if(n < 2) return false;
        else if (n == 2) return true;
        else if (n % i == 0) return false;
        else if (i < n/2) return prost(n,i+1);
        else return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prost(n, 2));
    }
}
