package Converter;

import java.util.Scanner;

public class OnlineShop {
    OnlineShop()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do you have(rubles)?");
        double rubles = sc.nextDouble();
        Converter amount = new Converter(rubles);
        System.out.println("What currency do you choose for payment?");
        System.out.println("1.USD\n2.EUR\n3.GBP\n4.TJS");
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> System.out.println("You have: " + amount.toUSD() + " dollars!");
            case 2 -> System.out.println("You have: " + amount.toEUR() + " euros!");
            case 3 -> System.out.println("You have: " + amount.toGBP() + " pounds!");
            case 4 -> System.out.println("You have: " + amount.toTJS() + " somoni!");
        }
    }
}
