import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        float medium;
        System.out.print("Enter the length of the 1st array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of array: ");

        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        for (int j = 0; j < size; j++){
            sum += array[j];
        }
        
        System.out.println("The sum of 1st array is: " + sum);
        medium = (float)sum / (float)size;
        System.out.println("The medium of 1st array is: " + medium + '\n');

        System.out.print("Enter the length of the 2nd array: ");
        size = scan.nextInt();
        int[] array1 = new int[size];
        System.out.println("Enter the element of array: ");

        int sum1 = 0;
        int i = 0;
        while (i < size){
            array1[i] = scan.nextInt();
            i++;
        }

        int j = 0;
        do {
            sum1 += array1[j];
            j++;
        }
        while (j < size);
        System.out.println("The sum of 2nd array is: " + sum1);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int k = 0;
        while(k < size){
            int e = array1[k];

            if (e > max) max = e;
            if (e < min) min = e;

            k++;
        }
        System.out.println("Max element is: " + max);
        System.out.println("Min element is: " + min);

        ForArg forArg = new ForArg(args);
        Garmon garmon = new Garmon();
        System.out.println("The factorial is: " + Factorial.factorial());
    }
}