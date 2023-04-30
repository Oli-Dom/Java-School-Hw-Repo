import java.util.Calendar;

public class Pediatrician extends Doctor {

    private boolean hasPrivatePractice;
    private String hospitalName;

    public Pediatrician(String name) {
        super(name);
    }

    public Pediatrician(String name, boolean hasPrivatePractice, String hospitalName) {
        super(name);
        this.hasPrivatePractice = hasPrivatePractice;
        this.hospitalName = hospitalName;
    }

    public boolean hasPrivatePractice() {
        return hasPrivatePractice;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    // Method to add a patient
    public void addPatient(Patient patient) throws PatientException {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if ((currentYear - patient.getBirthYear()) >= 18) {
            throw new PatientException("This pediatrician only accepts patients who are under 18 years old.");
        } else {
            super.addPatient(patient);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPediatrician: has private practice=" + hasPrivatePractice + " | hospital name="
                + String.format("%15s", hospitalName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pediatrician) {
            Pediatrician other = (Pediatrician) obj;
            return super.equals(other) && this.hasPrivatePractice == other.hasPrivatePractice
                    && this.hospitalName.equals(other.hospitalName);
        }
        return false;
    }
}
