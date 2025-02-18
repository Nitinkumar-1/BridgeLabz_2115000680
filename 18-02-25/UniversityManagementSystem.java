import java.util.ArrayList;
import java.util.List;
abstract class CourseType {
    private String courseName;
    public CourseType(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    @Override
    public String toString() {
        return "Course Name: " + courseName;
    }
}
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}
class Course<T extends CourseType> {
    private T courseType;
    private int creditHours;
    public Course(T courseType, int creditHours) {
        this.courseType = courseType;
        this.creditHours = creditHours;
    }
    public T getCourseType() {
        return courseType;
    }
    public int getCreditHours() {
        return creditHours;
    }
    @Override
    public String toString() {
        return courseType.toString() + ", Credit Hours: " + creditHours;
    }
}
class CourseCatalog {
    private List<Course<? extends CourseType>> courses;
    public CourseCatalog() {
        courses = new ArrayList<>();
    }
    public <T extends CourseType> void addCourse(Course<T> course) {
        courses.add(course);
    }
    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        CourseCatalog catalog = new CourseCatalog();
        Course<ExamCourse> mathExamCourse = new Course<>(new ExamCourse("Mathematics"), 3);
        Course<AssignmentCourse> javaAssignmentCourse = new Course<>(new AssignmentCourse("Java Programming"), 4);
        Course<ResearchCourse> aiResearchCourse = new Course<>(new ResearchCourse("Artificial Intelligence"), 6);
        catalog.addCourse(mathExamCourse);
        catalog.addCourse(javaAssignmentCourse);
        catalog.addCourse(aiResearchCourse);
        System.out.println("University Course Catalog:");
        catalog.displayCourses();
    }
}
