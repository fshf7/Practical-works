package Employer;

public class TestEmployer {
    public static void main(String[] args) {
        Employer[] emps = new Employer[5];
        emps[0] = new Manager("Tom", " Hide", 123455, 1234);
        emps[1] = new Employer("Alex", " Ivanov", 32145);
        emps[2] = new Manager("Faridun", " Sharipov", 56894, 3552);
        emps[3] = new Employer("Ivan", " Nikitin", 12533);
        emps[4] = new Employer("Robert", " Perry", 78945);

        for(Employer emp : emps) {
            System.out.println(emp.getIncome());
        }
    }
}
