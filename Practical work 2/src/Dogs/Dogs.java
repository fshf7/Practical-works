package Dogs;

import java.util.ArrayList;
import java.util.Scanner;

public class Dogs {
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    Dog dog;

    public void addDogs(){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of dogs: ");
        n = scan.nextInt();
        System.out.println("Enter the names and ages of dogs: ");
        String nameOfDog;
        int age;
        for (int i = 0; i < n; i++) {
            nameOfDog = scan.next();
            age = scan.nextInt();
            dogs.add(new Dog(nameOfDog, age));
        }
    }

    public void outDogs(){
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).toString());
        }
    }
}
