package n11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int temp = sc.nextInt();
        System.out.println("Enter the type[C,F,K]");
        String type = sc.next();
        ConvertClass convert = new ConvertClass(temp, type);
        convert.convert();
        System.out.println(convert);
    }
}
