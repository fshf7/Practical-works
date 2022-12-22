package n2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int day, month, age;
        System.out.println("Enter the date (1 number - day, 2 - number of the months, 3 - year");
        day = sc.nextInt();
        month = sc.nextInt();
        age = sc.nextInt();

        Calendar calendar = new GregorianCalendar(age, month-1, day);
        Date date = calendar.getTime();
        Date date1 = new Date();

        if(date1.before(date)) System.out.println("The entered date will be later");
        else System.out.println("The entered date was before");
    }
}
