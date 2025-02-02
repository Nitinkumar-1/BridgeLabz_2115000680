public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Tech Academy";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 10, 499.99);
        Course course2 = new Course("Web Development", 12, 599.99);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("Global Tech Institute");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
