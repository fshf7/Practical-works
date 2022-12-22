package Atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "TShirt [" +
                "size: " + getSize() +
                ", color: " + getColor() +
                ", price: " + getPrice() +
                "]";
    }
}
