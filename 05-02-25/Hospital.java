import java.util.ArrayList;

class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    
    public void displayHospitalInfo() {
        System.out.println("Hospital: " + name);
        for (Doctor doctor : doctors) {
            doctor.displayPatients();
        }
        for (Patient patient : patients) {
            patient.displayDoctors();
        }
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;
    
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }
    
    public void displayPatients() {
        System.out.println("Doctor: " + name);
        for (Patient patient : patients) {
            System.out.println("Consulted Patient: " + patient.getName());
        }
    }
}

class Patient {
    private String name;
    private ArrayList<Doctor> doctors;
    
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
    
    public void displayDoctors() {
        System.out.println("Patient: " + name);
        for (Doctor doctor : doctors) {
            System.out.println("Consulted with Doctor: " + doctor.name);
        }
    }
    
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        
        Doctor doctor1 = new Doctor("Dr. Adams");
        Doctor doctor2 = new Doctor("Dr. Brown");
        
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);
        
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        hospital.displayHospitalInfo();
    }
}
