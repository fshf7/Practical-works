package Atelier;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Pants [" +
                "size: " + getSize() +
                ", color: " + getColor() +
                ", price: " + getPrice() +
                "]";
    }
}
