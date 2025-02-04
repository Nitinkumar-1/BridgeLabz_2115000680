public class Student {
    private static String universityName = "XYZ University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;  
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            this.grade = newGrade; 
            System.out.println("Grade updated to: " + this.grade);
        } else {
            System.out.println("The provided object is not an instance of Student.");
        }
    }
    public void printStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Name: " + student.name);
            System.out.println("Grade: " + student.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("The provided object is not an instance of Student.");
        }
    }
        public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");
        Student.displayTotalStudents();
        student1.printStudentDetails(student1);  
        student2.printStudentDetails(student2);  
        student1.updateGrade(student1, "A+");  
        student2.updateGrade(student2, "B+"); 
        Student.displayTotalStudents();
    }
}
