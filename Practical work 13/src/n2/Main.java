package n2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        person.setName(sc.nextLine());
        person.setSecondName(sc.nextLine());
        person.setFatherName(sc.nextLine());

        System.out.println(person.to_string());
    }
}
