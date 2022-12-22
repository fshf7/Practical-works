public class Garmon {
    public Garmon() {
        System.out.println("\n10 numbers of a harmonic series: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%.4f %n", (double) 1/i);
        }
    }
}
