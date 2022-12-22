package InternetMarket;

public class Basket {
    private final Product[] products;

    public Basket(int size) {
        products = new Product[size];
    }

    public void display() {
        for (int i = 0; i < products.length; i++)
            if (products[i] != null)
                System.out.println((i + 1) + ". " + products[i]);
    }

    public boolean add(Product product) {
        for (int i = 0; i < products.length; i++)
            if (products[i] == null) {
                products[i] = product;
                return true;
            }

        return false;
    }

    public void pay() {
        double sum = 0;

        for (int i = 0; i < products.length; i++)
            if (products[i] != null) {
                System.out.println((i + 1) + ". " + products[i]);
                sum += products[i].getPrice();
            }

        if (sum == 0)
            System.out.println("Empty basket!");
        else
            System.out.println("Receipt: " + sum);
    }
}
