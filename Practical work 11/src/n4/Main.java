package n4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        Calendar calendar = new GregorianCalendar(age, month-1, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy, MM, d, HH:mm");
        System.out.println(simpleDate.format(date));
    }
}
