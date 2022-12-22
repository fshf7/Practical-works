package n10;

public class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.size + "gb RAM";
    }
}
