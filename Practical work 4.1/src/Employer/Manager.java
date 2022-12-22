package Employer;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, int income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    public double getIncome() {
        return super.getIncome() + this.averageSum;
    }
}
