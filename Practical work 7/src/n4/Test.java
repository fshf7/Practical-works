package n4;

public class Test {
    public static void main(String[] args) {
        MathCalculable num = new MathFunc();
        int deg = (int) num.degree(4,2);
        System.out.println("Degree: " + deg);
        MathCalculable m = new MathFunc();
        double mod = m.module(4,5);
        System.out.println("Module: " + mod);
        MathCalculable len = new MathFunc(20);
        System.out.println(len);
    }
}
