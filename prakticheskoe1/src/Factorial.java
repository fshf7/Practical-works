import java.util.Scanner;

public class Factorial {
    public static int factorial(){
        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.println("\nEnter the number to calculate factorial: ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
