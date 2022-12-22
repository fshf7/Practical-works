package n8;

import java.util.Scanner;

public class Main {
    public static String polindrom(String s)
    {
        if(s.length() == 1) return "Yes";
        else
        {
            if(s.substring(0,1).equals(s.substring(s.length()-1, s.length())))
            {
                if(s.length() == 2) return "Yes";
                return polindrom(s.substring(1,s.length()-1));
            }
            else return "No";
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(polindrom(s));
    }
}
