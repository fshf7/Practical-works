package n4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Stud> students = new ArrayList<>();
        students.add(new Stud("Basya","Impov",7, 10));
        students.add(new Stud("Garen","Marov",3, 50));
        students.add(new Stud("Basya","Brown",6, 60));
        students.add(new Stud("Alex","Merser",1, 70));
        System.out.println("Array before sorting");
        for (Stud s: students) {
            System.out.println(s.toString());
        }
        Collections.sort(students);
        System.out.println("Array after sorting");
        for (Stud s: students) {
            System.out.println(s.toString());
        }
    }
}
