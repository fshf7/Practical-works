package Computer;

public class Processor extends Computer {
    private String name;

    public Processor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Processor[" +
                "name: '" + name + '\'' +
                ']';
    }
}
