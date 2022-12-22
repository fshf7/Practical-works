package Furnuture;

public class Sofa extends Furniture {
    private int seatPlaces;

    public Sofa() {}

    public Sofa(int seatPlaces) { this.seatPlaces = seatPlaces; }

    public Sofa (String material, int price, int seatPlaces){
        super(material, price);
        this.seatPlaces = seatPlaces;
    }

    public int getPrice() {
        return this.price * seatPlaces;
    }

    @Override
    public String toString() {
        return "Sofa: made of " + this.material + " for "
                + this.price + " per places"
                + "; full price for "
                + this.seatPlaces + " person sofa is "
                + (this.price * this.seatPlaces);
    }
}
