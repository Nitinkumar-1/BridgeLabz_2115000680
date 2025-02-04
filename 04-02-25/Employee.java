public class Employee {
    private static String companyName = "ABC Corp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;
    public Employee(int id, String name, String designation) {
        this.id = id; 
        this.name = name;
        this.designation = designation;
        totalEmployees++; 
    }
    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
    public void printEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            System.out.println("Employee ID: " + employee.id);
            System.out.println("Employee Name: " + employee.name);
            System.out.println("Employee Designation: " + employee.designation);
            System.out.println("Company: " + companyName);
        } else {
            System.out.println("The provided object is not an instance of Employee.");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Nitin Kumar", "Software Engineer");
        Employee emp2 = new Employee(2, "Nishant Kumar Singh ", "Product Manager");
        Employee.displayTotalEmployees();
        emp1.printEmployeeDetails(emp1);
        emp1.printEmployeeDetails("Not an Employee"); 
    }
}
