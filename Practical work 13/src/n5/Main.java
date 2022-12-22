package n5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder out = new StringBuilder();

        if(str.startsWith("+7")){
            for (int i = 0; i < str.length(); i++)
            {
                out.append(str.charAt(i));
                if(i == 4) out.append("-");
                if(i == 7) out.append("-");
            }
            System.out.println(out);
        }
        else if(str.startsWith("8")){
            for (int i = 0; i < str.length(); i++)
            {
                out.append(str.charAt(i));
                if(i == 3) out.append("-");
                if(i == 6) out.append("-");
            }
            System.out.println(out);
        }
        else{
            System.out.println("Error");
        }
    }
}
