package Employer;

public class Employer {
    private String firstName;

    private String lastName;

    private double income;

    public Employer() {}
    public Employer(String firstName, String lastName, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIncome() {
        System.out.print(getFirstName() + getLastName() + ": ");
        return income;
    }
}
