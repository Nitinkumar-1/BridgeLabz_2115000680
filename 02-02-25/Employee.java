class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.employeeID = "M12345";
        manager.department = "HR";
        manager.setSalary(60000.00);

        manager.displayDetails();
    }
}
