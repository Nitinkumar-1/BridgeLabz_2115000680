public class Patient {
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;  
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;  
    }
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("Patient ID: " + patient.patientID);
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Ailment: " + patient.ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("The provided object is not an instance of Patient.");
        }
    }
    public static void displayHospitalName() {
        System.out.println("Hospital: " + hospitalName);
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "John Doe", 45, "Fever");
        Patient patient2 = new Patient("P002", "Jane Smith", 30, "Cough");
        Patient.getTotalPatients();
        patient1.displayPatientDetails(patient1);  
        patient2.displayPatientDetails(patient2);  
        Patient.displayHospitalName();
    }
}
