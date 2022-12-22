package n1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count;

        System.out.println("Enter the number of students: ");
        count = sc.nextInt();

        Student[] mas = new Student[count];

        for (int i = count; i > 0; i--)
        {
            mas[count - i] =  new Student(1000 + i, "Test name #" + (i));
        }

        for (int i = 0; i < count; i++)
        {
            System.out.println(mas[i].to_string());
        }
        System.out.println();

        for (int left = 0; left < mas.length; left++)
        {

            int value = mas[left].ID;
            Student std = mas[left];
            int i = left - 1;
            for (; i >= 0; i--)
            {
                if (value < mas[i].ID)
                {
                    mas[i + 1] = mas[i];
                }
                else break;
            }
            mas[i + 1] = std;
        }

        for (int i = 0; i < count; i++)
        {
            System.out.println(mas[i].to_string());
        }
    }
}
