package InternetMarket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("123", "123");

        System.out.println("Authentication:");
        System.out.println("Please enter the login and password of the user: ");

        String login = scanner.nextLine();
        String password = scanner.nextLine();

        if (user.authentificate(login, password))
            new Market(user).displayMenu();
        else
            System.out.println("Error with authentication!");

        scanner.close();
    }
}
