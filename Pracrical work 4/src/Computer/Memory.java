package Computer;

public class Memory extends Computer{
    private byte ramMemory, graphicsMemory;
    private short hardDiskMemory;

    public Memory(byte ramMemory, byte graphicsMemory, short hardDiskMemory) {
        this.ramMemory = ramMemory;
        this.graphicsMemory = graphicsMemory;
        this.hardDiskMemory = hardDiskMemory;
    }

    public byte getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(byte ramMemory) {
        this.ramMemory = ramMemory;
    }

    public byte getGraphicsMemory() {
        return graphicsMemory;
    }

    public void setGraphicsMemory(byte graphicsMemory) {
        this.graphicsMemory = graphicsMemory;
    }

    public short getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(short hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    @Override
    public String toString() {
        return "Memory[" +
                "ramMemory: " + ramMemory +
                ", graphicsMemory: " + graphicsMemory +
                ", hardDiskMemory: " + hardDiskMemory +
                ']';
    }
}
