package Converter;

public class Converter {
    double rubles;

    Converter(double rubles) {
        this.rubles = rubles;
    }

    public double toUSD() {
        return rubles / 61.50;
    }

    public double toEUR() {
        return rubles / 60.47;
    }

    public double toGBP() {
        return rubles / 69.21;
    }
    public double toTJS() {
        return rubles / 6.12;
    }
}
