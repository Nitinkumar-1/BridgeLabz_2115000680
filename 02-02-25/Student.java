public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It should be between 0.0 and 4.0.");
        }
    }
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    private String researchTopic;
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }
    public void displayPostgraduateInfo() {
        displayStudentInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice Johnson", 3.8, "Artificial Intelligence");
        pgStudent.displayPostgraduateInfo();
        pgStudent.setCGPA(3.9);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
