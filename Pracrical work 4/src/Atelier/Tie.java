package Atelier;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie [" +
                "size: " + getSize() +
                ", color: " + getColor() +
                ", price: " + getPrice() +
                "]";
    }
}
