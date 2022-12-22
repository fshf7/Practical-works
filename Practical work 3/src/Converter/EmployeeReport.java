package Converter;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeReport {
   static ArrayList<Employee> employees = new ArrayList<>(10);
   static int current = 0;
   Scanner scan = new Scanner(System.in);

   private static class Employee{
      String fullName;
      double salary;

      public Employee(String fullName, double salary) {
         this.fullName = fullName;
         this.salary = salary;
      }
   }

   public static class Report{
      public static void generateReport(){
         System.out.printf("%-20s %15s %n", "Full name", "Salary");
         for(int i = 0; i < current; i++){
            System.out.printf("%-20s %15.2f %n", employees.get(i).fullName, employees.get(i).salary);
         }
      }
   }

   public void addEmployee()
   {
      if(current == 10)
      {
         System.out.println("Exceeded the employee limit!");
         return;
      }
      System.out.println("Full name: ");
      String fullName = scan.next();
      System.out.println("Salary: ");
      double salary = scan.nextDouble();
      employees.add(new Employee(fullName, salary));
      current++;
   }
}
