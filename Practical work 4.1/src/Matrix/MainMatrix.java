package Matrix;

import java.util.Scanner;

public class MainMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cols and rows: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        Matrix m1 = new Matrix(col, row);
        System.out.println("Cols and rows for 2nd matrix:");
        row = sc.nextInt();
        col = sc.nextInt();
        Matrix m2 = new Matrix(col, row);
        System.out.println("The sum is:");
        m1.matrixSum(m2);
        m1.outputMatrix();
        System.out.println("Multiplication of 2nd matrix on 5:");
        m1.matrixMultiplication(5);
        m1.outputMatrix();
    }



}
