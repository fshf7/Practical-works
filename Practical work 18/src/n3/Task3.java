package n3;

import java.util.Scanner;

public class Task3 {
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
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
    }
    public static void main(String[] args) {
        exceptionDemo();
    }
}
