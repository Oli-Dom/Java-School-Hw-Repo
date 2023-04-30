public class Doctor implements SeesPatients, Comparable<Doctor> {
    private static int numDoctors = 0;
    private String name;
    private int licenseNumber = numDoctors;
    private Patient[] patients;
    private int numberOfPatients;

    public Doctor(String name) {
        if (name != null) {
            this.name = name;
        }
        patients = new Patient[MAX_PATIENTS];
        numberOfPatients = 0;
        ++numDoctors;
    }

    public static int getNumDoctors() {
        return numDoctors;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public String getPatientsAsString() {
        String s = "patients= ";
        for (int i = 0; i < numberOfPatients; i++) {
            s += patients[i].toString();
            if (i < numberOfPatients - 1) {
                s += ", ";
            }
        }
        return s;
    }

    public Patient[] getPatients() {
        Patient[] patientsArr = new Patient[numberOfPatients];
        for (int i = 0; i < numberOfPatients; i++) {
            patientsArr[i] = this.patients[i];
        }

        return patientsArr;
    }

    public boolean isPatient(Patient p) {
        boolean isPatient = false;
        for (int i = 0; i < numberOfPatients; i++) {
            if (patients[i].equals(p)) {
                isPatient = true;
                break;
            }
        }
        return isPatient;
    }

    public void addPatient(Patient p) throws PatientException {
        boolean added = false;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = p;
                added = true;
                break;
            }
        }
        numberOfPatients++;
        if (!added) {
            throw new PatientException("No space available to add patient.");
        }
    }

    @Override
    public String toString() {
        String s = String.format("Doctor: name= %20s | license number= %06d | %s", name, licenseNumber,
                getPatientsAsString());
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Doctor) {
            Doctor otherDoc = (Doctor) o;
            if (this.numberOfPatients == otherDoc.numberOfPatients) {
                if (this.name.equals(otherDoc.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int compareTo(Doctor d) {
        if (this.numberOfPatients > d.numberOfPatients) {
            return 1;
        } else if (this.numberOfPatients < d.numberOfPatients) {
            return -1;
        } else {

            return 0;
        }

    }

}
