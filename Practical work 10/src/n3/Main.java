package n3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count1, count2;
        System.out.println("Enter the number of students in 1st and 2nd list:");
        count1 = sc.nextInt();
        count2 = sc.nextInt();

        Student[] mas1 = new Student[count1];
        Student[] mas2 = new Student[count2];

        for (int i = count1; i > 0; i--)
        {
            mas1[i-1] = new Student(100+i, "TestName #" + (count1 - i));
        }
        for (int i = count2; i > 0; i--)
        {
            mas2[i-1] = new Student(200+i, "TestName #" + (count2 - i) + count1);
        }

        MergeSort ms = new MergeSort(mas1, mas2);
        ms.array();
        ms.to_string();
        System.out.println();
        ms.mergeSort(ms.mas, 0 , count1+count2-1);
        ms.to_string();
    }
}
