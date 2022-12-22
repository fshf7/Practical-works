package n3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firstname:");
        String name = sc.nextLine();
        System.out.print("Enter the secondname:");
        String secondName = sc.nextLine();
        System.out.print("Enter the date of birth (day months year):");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int age = sc.nextInt();
        System.out.println("Enter the speciality id:");
        int speciality = sc.nextInt();
        System.out.println("Enter the course:");
        int course = sc.nextInt();
        System.out.println("Enter the group:");
        int group = sc.nextInt();
        System.out.println("Enter the score:");
        int score = sc.nextInt();
        Student student = new Student(name, secondName, day, month, age, speciality, course, group, score);
        System.out.println(student.toString());
    }
}
