package InternetMarket;

public class Product {
    private final String name;
    private final double price;
    private final double ranking;

    public Product(String name, double price, double ranking) {
        this.name = name;
        this.price = price;
        this.ranking = ranking;
    }

    public String toString() {
        return name + " [ranking=" + ranking + ", price=" + price + "]";
    }

    public double getPrice() {
        return price;
    }
}
