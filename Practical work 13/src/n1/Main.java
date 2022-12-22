package n1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = 0;

        System.out.println(str.charAt(str.length() - 1));

        if(str.endsWith("!!!")) System.out.println("String ends with \"!!!\" ");
        else System.out.println("String doesn't end with \"!!!\" ");

        if(str.startsWith("I like")) System.out.println("String starts with \"I like\"");
        else System.out.println("String doesn't start with \"I like\"");

        if(str.contains("Java")) System.out.println("The string contains a substring \"Java\"");
        else System.out.println("The string does not contain a substring \"Java\"");

        for (int i = 0; i < str.length()-4; i++)
        {
            if(str.charAt(i) == 'J' & str.charAt(i+1) == 'a' & str.charAt(i+2) == 'v' & str.charAt(i+3) == 'a')
            {
                System.out.println("Substring \"Java\" starts with " + i + " index till " + (i + 3) + "");
                index = i;
                break;
            }
        }

        char[] chr = new char[str.length()];
        System.out.println();
        for (int i = 0; i < str.length(); i++)
        {
            chr[i] += str.charAt(i);
            if(chr[i] == 'a') chr[i] = 'o';
            System.out.print(chr[i]);
        }

        System.out.println();
        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.substring(index, index+4));
    }
}