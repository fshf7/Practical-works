package Computer;

public enum Brand {
    DELL,
    HP,
    MACBOOK,
    ASUS,
    ACER,
    LENOVO;

    @Override
    public String toString() {
        return name();
    }
}
