package n10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements ShopActions {
    Scanner sc = new Scanner(System.in);
    ArrayList<Computer> comps = new ArrayList<>();

    Shop() {}

    @Override
    public void fillComputerInformation(int n) {
        String br;
        String procName;
        int memoryAmount;
        String monitorResolution;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the brand (ASUS, DELL, HP, MSI):");
            br = sc.next();
            Brands brand =  Brands.valueOf(br);
            System.out.println("Enter the name of processor:");
            procName = sc.next();
            Processor proc = new Processor(procName);
            System.out.println("Enter the size of memory:");
            memoryAmount = sc.nextInt();
            Memory mem = new Memory(memoryAmount);
            System.out.println("Enter the monitor resolution:");
            monitorResolution = sc.next();
            Monitor mon = new Monitor(monitorResolution);
            comps.add(new Computer(i + 1, proc, mem, mon, brand));
            System.out.println(comps.get(comps.size()-1).toString() + " added");
        }
    }

    @Override
    public void addComputer() {
        String br;
        String procName;
        int memoryAmount;
        String monitorResolution;
        System.out.println("Enter the brand (ASUS, DELL, HP, MSI):");
        br = sc.nextLine();
        Brands brand =  Brands.valueOf(br);
        System.out.println("Enter the name of processor:");
        procName = sc.nextLine();
        Processor proc = new Processor(procName);
        System.out.println("Enter the size of memory:");
        memoryAmount = sc.nextInt();
        Memory mem = new Memory(memoryAmount);
        System.out.print("Enter the monitor resolution:");
        monitorResolution = sc.nextLine();
        Monitor mon = new Monitor(monitorResolution);
        comps.add(new Computer(comps.size() + 1, proc, mem, mon, brand));
        System.out.println(comps.get(comps.size()-1).toString() + " is added");
    }

    @Override
    public void deleteComputer(int id) {
        for (Computer cp : comps) {
            if (cp.getID() == id) {
                comps.remove(cp);
                System.out.println("Computer deleted!");
                return;
            }
        }
        System.out.println("Computer not found!");
    }

    @Override
    public Computer findComputer(int id) {
        for (Computer cp : comps) {
            if (cp.getID() == id) { return cp; }
        }
        return null;
    }

    @Override
    public void showComputers(){
        for(Computer comp : comps) {
            System.out.println(comp.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("Enter an amount of computers:");
        int num = sc.nextInt();
        shop.fillComputerInformation(num);
        System.out.println(shop.findComputer(2));
        shop.deleteComputer(1);
        shop.showComputers();
    }
}
