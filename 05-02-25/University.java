import java.util.ArrayList;
class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;
    
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
    
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }
    
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    
    public void displayUniversityStructure() {
        System.out.println("University: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
        for (Faculty faculty : faculties) {
            System.out.println("Faculty: " + faculty.getName());
        }
    }
}

class Department {
    private String name;
    
    public Department(String name) {
        this.name = name;
    }
    
    public void displayDepartment() {
        System.out.println("Department: " + name);
    }
}

class Faculty {
    private String name;
    
    public Faculty(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University("Tech University");
        
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");
        
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        
        university.displayUniversityStructure();
    }
}
