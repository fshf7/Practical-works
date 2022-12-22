package Atelier;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt [" +
                "size: " + getSize() +
                ", color: " + getColor() +
                ", price: " + getPrice() +
                "]";
    }
}
