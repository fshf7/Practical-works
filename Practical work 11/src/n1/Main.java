package n1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args)
    {
        Date date = new Date();
        String fullName = "Sharipov F.F.";
        Calendar calendar = new GregorianCalendar(2022, 9, 14);
        Date date2 = calendar.getTime();
        System.out.println("Now: " + date);
        System.out.println(fullName + "   " + date2);
    }
}