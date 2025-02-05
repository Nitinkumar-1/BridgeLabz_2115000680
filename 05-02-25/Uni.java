import java.util.ArrayList;

class University {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;
    
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public void displayUniversityInfo() {
        System.out.println("University: " + name);
        for (Student student : students) {
            student.displayEnrolledCourses();
        }
        for (Professor professor : professors) {
            professor.displayCourses();
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;
    
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }
    
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }
    
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        for (Course course : enrolledCourses) {
            System.out.println("Enrolled in: " + course.getName());
        }
    }
}

class Professor {
    private String name;
    private ArrayList<Course> assignedCourses;
    
    public Professor(String name) {
        this.name = name;
        this.assignedCourses = new ArrayList<>();
    }
    
    public void assignCourse(Course course) {
        assignedCourses.add(course);
        course.setProfessor(this);
    }
    
    public void displayCourses() {
        System.out.println("Professor: " + name);
        for (Course course : assignedCourses) {
            System.out.println("Teaches: " + course.getName());
        }
    }
}

class Course {
    private String name;
    private Professor professor;
    private ArrayList<Student> students;
    
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getName() {
        return name;
    }
    
    public void displayStudents() {
        System.out.println("Course: " + name);
        for (Student student : students) {
            System.out.println("Enrolled Student: " + student.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University university = new University("Tech University");
        
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");
        
        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");
        
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);
        
        university.addStudent(student1);
        university.addStudent(student2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addCourse(course1);
        university.addCourse(course2);
        
        university.displayUniversityInfo();
        course1.displayStudents();
        course2.displayStudents();
    }
}
