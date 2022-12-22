package n4;

public class MathFunc implements MathCalculable{
    private double r;
    public MathFunc(){};
    public MathFunc(double r){
        this.r = r;
    }
    @Override
    public double degree(int n, int p) {
        return Math.pow(n, p);
    }
    @Override
    public double module(int re, int im) {
        return Math.sqrt((re*re)+(im*im));
    }

    @Override
    public String toString() {
        return "Circle length(PI): " + 2*pi*r;
    }
}


