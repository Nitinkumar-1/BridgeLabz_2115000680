import java.util.ArrayList;
import java.util.List;
abstract class JobRole {
    private String candidateName;
    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }
    public String getCandidateName() {
        return candidateName;
    }
    @Override
    public String toString() {
        return "Candidate: " + candidateName;
    }
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }
}
class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }
}
class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }
}
class Resume<T extends JobRole> {
    private T jobRole;
    private String resumeContent;
    public Resume(T jobRole, String resumeContent) {
        this.jobRole = jobRole;
        this.resumeContent = resumeContent;
    }
    public T getJobRole() {
        return jobRole;
    }
    public String getResumeContent() {
        return resumeContent;
    }
    @Override
    public String toString() {
        return jobRole.toString() + ", Resume: " + resumeContent;
    }
}
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes;
    public ResumeScreeningSystem() {
        resumes = new ArrayList<>();
    }
    public <T extends JobRole> void addResume(Resume<T> resume) {
        resumes.add(resume);
    }
    public void processResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println("Processing: " + resume);
        }
    }
}
public class AIResumeScreening {
    public static void main(String[] args) {
        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(new Resume<>(new SoftwareEngineer("Alice"), "Java, Spring Boot, Microservices"));
        screeningSystem.addResume(new Resume<>(new DataScientist("Bob"), "Python, Machine Learning, Data Analysis"));
        screeningSystem.addResume(new Resume<>(new ProductManager("Charlie"), "Agile, Market Research, Strategy"));
        System.out.println("AI-Driven Resume Screening:");
        screeningSystem.processResumes();
    }
}
