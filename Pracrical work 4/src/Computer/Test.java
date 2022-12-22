package Computer;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Computer[] computers = {
                new Computer(
                        new Processor("INTEL"),
                        new Memory((byte) 16, (byte) 4, (short) 1024),
                        new Monitor("IPS", (byte) 15),
                        Brand.ACER),
                new Computer(
                        new Processor("AMD"),
                        new Memory((byte) 12, (byte) 4, (short) 512),
                        new Monitor("IPS", (byte) 17),
                        Brand.HP),
                new Computer(
                        new Processor("INTEL"),
                        new Memory((byte) 8, (byte) 2, (short) 256),
                        new Monitor("TN", (byte) 15),
                        Brand.ASUS),
                new Computer(
                        new Processor("INTEL"),
                        new Memory((byte) 16, (byte) 4, (short) 1024),
                        new Monitor("IPS", (byte) 15),
                        Brand.DELL),
                new Computer(
                        new Processor("INTEL"),
                        new Memory((byte) 8, (byte) 2, (short) 256),
                        new Monitor("IPS", (byte) 15),
                        Brand.LENOVO),
        };

        for (Computer computer : computers) {
            System.out.println(computer + "\n");
        }
    }
}
