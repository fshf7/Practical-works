package Computer;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand){
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public Computer() {
    }


    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) { this.processor = processor;}

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer: " + brand + "\n" +
                processor + " " +
                memory + " " +
                monitor + " ";
    }
}
