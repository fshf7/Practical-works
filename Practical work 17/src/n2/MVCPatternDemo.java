package n2;

public class MVCPatternDemo {
    public static void main(String[] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Samuel");
        controller.setEmployeeRate(2000);
        System.out.println("After updating: ");
        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Emanuel");
        employee.setRate(500);
        employee.setHours(36);
        return employee;
    }
}
