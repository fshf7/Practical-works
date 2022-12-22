package Furnuture;

public class Table extends Furniture {
    private int size;

    public Table() {}

    public Table(int size) {
        this.size = size;
    }

    public Table(String material, int price, int size) {
        super(material, price);
        this.size = size;
    }

    public int getPrice() {
        return this.price * size;
    }

    @Override
    public String toString() {
        return "Table: made of " + this.material + " for "
                + this.price + " per table"
                + "; full price for " + this.size
                + " tables is " + (this.price * this.size);
    }
}
