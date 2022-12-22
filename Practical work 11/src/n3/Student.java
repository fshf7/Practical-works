package n3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    private String name;
    private String secondName;
    private int speciality;
    private int course;
    private int group;
    private int sum;
    private Calendar calendar = new GregorianCalendar();
    private Date date;
    private SimpleDateFormat dateFormat;

    public Student(String name, String secondName, int day, int month, int age, int speciality, int course, int group, int sum)
    {
        this.name = name;
        this.secondName = secondName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.sum = sum;
        this.calendar = new GregorianCalendar(age, month-1, day);
        this.dateFormat = new SimpleDateFormat("dd MM yyyy");
        this.date = calendar.getTime();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getSpeciality() {
        return speciality;
    }
    public int getCourse() {
        return course;
    }
    public int getGroup() {
        return group;
    }
    public int getSum() {
        return sum;
    }

    public String toString()
    {
        return name + " " + secondName + "\nThe date of birth: " + dateFormat.format(date) +  "\nspeciality - " + speciality + ";\ncourse - " + course + ";\nGroup - " + group + ";\nScore - " + sum;
    }
}
