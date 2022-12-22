package n4;

import java.util.Scanner;

public class Task4 {
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
            System.out.println("Enter a NUMBER");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } finally {
            System.out.println("finally block has been processed");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
