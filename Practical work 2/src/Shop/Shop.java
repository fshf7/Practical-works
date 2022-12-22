package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<Computer> comps = new ArrayList<Computer>();
    Computer comp;
    String name;
    public void outComps(){
        for (int i = 0; i < comps.size(); i++) {
            System.out.println(comps.get(i).getName());
        }
    }
    public void find_comp(){
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of PC which we looking up: ");
        name = scanner.next();
        for (int i = 0; i < comps.size(); i++) {
            if (comps.get(i).getName().equals(name)) {
                flag = true;
                System.out.println("User's PC has been found!");
                break;
            }
        }
        if (!flag) {
            System.out.println("We haven't this PC.");
        }
    }
    public void add_comp(){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of computers: ");
        n = scan.nextInt();
        System.out.println("Enter the names of the new PC: ");
        String newPC;
        for (int i = 0; i < n; i++) {
            newPC = scan.next();
            comps.add(new Computer(newPC));
        }
    }
    public void rm_comps(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which PC do you want remove?: ");
        name = scan.nextLine();
        for (int i = 0; i < comps.size(); i++) {
            if(comps.get(i).getName().equals(name)){
                comps.remove(i);
                System.out.println("Your PC is successfully removed!");
                System.out.println("Your list of computers: ");
                outComps();
            }
        }
    }


}
