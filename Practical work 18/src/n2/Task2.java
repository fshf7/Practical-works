package n2;

import java.util.Scanner;

public class Task2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException e) {
            System.out.println("Enter a NUMBER");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }
    public static void main(String[] args) {
        exceptionDemo();
    }
}
