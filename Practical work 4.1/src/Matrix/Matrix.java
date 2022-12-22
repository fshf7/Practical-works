package Matrix;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Matrix {
    private final int col;
    private final int row;
    private final int[][] matrix = new int[10][10];

    public Matrix(int c, int r) {
        Scanner sc = new Scanner(System.in);
        int num;
        this.col = c;
        this.row = r;
        System.out.println("Fill the matrix:");
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                num = sc.nextInt();
                matrix[i][j] = num;
            }
        }
    }

//    public void fillMatrix() {
//        System.out.println("Fill the matrix:");
//        Scanner sc = new Scanner(System.in);
//        int num;
//        for (int i = 0; i < this.col; i++) {
//            for (int j = 0; j < this.row; j++) {
//                num = sc.nextInt();
//                matrix[i][j] = num;
//            }
//        }
//    }

    public void outputMatrix() {
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void matrixSum(@NotNull Matrix mt) {
        if (this.col == mt.col && this.row == mt.row){
            for (int i = 0; i < this.col; i++) {
                for (int j = 0; j < this.row; j++) {
                    this.matrix[i][j] += mt.matrix[i][j];
                }
            }
        }
        else {
            System.out.println("Matrix are not equal, element by element addition is impossible\n");
        }
    }

    public void matrixMultiplication(int num) {
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }
}
