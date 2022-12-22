package InternetMarket;

import java.util.Scanner;

public class Market {
    private static final Category[] categories = {
            new Category("Bakery", new Product[] {
                    new Product("Bread", 34.0, 4.3),
                    new Product("Biscuit", 60.0, 5.0),
                    new Product("Cookies", 75.0, 4.9),
            }),
            new Category("Diary", new Product[] {
                    new Product("Milk", 123.0, 4.3),
                    new Product("Kefir", 86.0, 4.2),
                    new Product("Curd", 75.0, 5.0),
            }),
    };

    private final Client client;

    public Market(User user) {
        client = Client.fromUser(user, 10);
    }

    public void displayMenu() {
        System.out.println();
        System.out.println("Menu: ");
        System.out.println("1. Categories of products");
        System.out.println("2. Basket");
        System.out.println("3. Pay");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayCategories();
                break;
            case 2:
                System.out.println();
                client.getBasket().display();
                displayMenu();
                break;
            case 3:
                client.getBasket().pay();
                break;
            default:
                break;
        }

        scanner.close();
    }

    private void displayCategories() {
        System.out.println();
        for (int i = 0; i < categories.length; i++)
            System.out.println((i + 1) + ". " + categories[i].getName());
        System.out.println("0. Back");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice <= categories.length && choice > 0)
            displayProducts(categories[choice - 1]);
        else
            displayMenu();

        scanner.close();
    }

    private void displayProducts(Category category) {
        Product[] products = category.getProducts();

        System.out.println();
        for (int i = 0; i < products.length; i++)
            System.out.println((i + 1) + ". " + products[i]);
        System.out.println("0. Back");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice <= products.length && choice > 0)
            if (client.buyProduct(products[choice - 1]))
                System.out.println("Bought " + products[choice - 1]);
            else
                System.out.println("Basket full!");

        displayCategories();
        scanner.close();
    }

    public static void Buy() {
        // Basket cards = new Basket(card);
        // client.usersBasket = cards;
        // System.out.println("Sales receipt: ");
        // for (int i = 0; i < client.usersBasket.usersBasket.length; ++i) {
        // if (client.usersBasket.usersBasket[i] == null)
        // break;
        // System.out.println((i + 1) + ". " + client.usersBasket.usersBasket[i].name +
        // " ------- "
        // + client.usersBasket.usersBasket[i].price + " ------- "
        // + client.usersBasket.usersBasket[i].ranking);
        // }
        // double gc = getCash(client.usersBasket.usersBasket);
        // System.out.print("The total amount of purchases is -------" + gc);
    }
}
