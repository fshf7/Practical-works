package Circles;

public class Circle {
    private double r;

    public double getS(){
        return 3.14 * r * r;
    }

    public double getL(){
        return 2 * 3.14 * r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void circlesEquality(double r, double secondR){
        if (r == secondR){
            System.out.println("Circles are equal!");
        }
        else{
            System.out.println("Circles aren't equal!");
        }
    }
}
