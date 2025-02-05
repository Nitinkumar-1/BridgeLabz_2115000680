import java.util.ArrayList;
class Company {
    private String name;
    private ArrayList<Department> departments;
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }
    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }
}
class Department {
    private String name;
    private ArrayList<Employee> employees;
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }
    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.getName());
        }
    }
}
class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");
        company.addDepartment("Engineering");
        company.addDepartment("Marketing");
        company.departments.get(0).addEmployee("Alice");
        company.departments.get(0).addEmployee("Bob");
        company.departments.get(1).addEmployee("Charlie");
        company.displayCompanyStructure();
    }
}
