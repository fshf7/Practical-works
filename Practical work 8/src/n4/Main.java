package n4;

import java.util.Scanner;

public class Main {
    public static int counter(int len, int sum, int k, int s)
    {
        if(len == k)
        {
            if (sum == s)
            {
                return 1;
            }
            else return 0;
        }

        int zero = (len == 0 ? 1 : 0);
        int result = 0;
        for (int i = zero; i < 10; i++)
        {
            result += counter(len+1, sum+i, k, s);
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(counter(0,0, k, s));
    }
}
