package n2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        count = sc.nextInt();
        System.out.println();

        SortingStudentsByGPA array = new SortingStudentsByGPA(count);
        array.out();
        array.quickSort(array.mas, 0, count-1);
        System.out.println();
        array.out();
    }

}
