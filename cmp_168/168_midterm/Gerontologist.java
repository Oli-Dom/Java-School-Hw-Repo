import java.util.Calendar;

public class Gerontologist extends Doctor {
    private boolean performsHouseCalls = true;
    private double visitFee = 0.0;

    public Gerontologist(String name) {
        super(name);
    }

    public Gerontologist(String name, boolean performsHouseCalls, double visitFee) {
        super(name);
        this.performsHouseCalls = performsHouseCalls;
        this.visitFee = visitFee;
    }

    public boolean performsHouseCalls() {
        return performsHouseCalls;
    }

    public double getVisitFee() {
        return visitFee;
    }

    public void setPerformsHouseCalls(boolean performsHouseCalls) {
        this.performsHouseCalls = performsHouseCalls;
    }

    public void setVisitFee(double visitFee) {
        if (visitFee < 0) {
            this.visitFee = 0;
        } else {

            this.visitFee = visitFee;
        }
    }

    public void addPatient(Patient patient) throws PatientException {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if ((currentYear - patient.getBirthYear()) > 65) {
            super.addPatient(patient);
        } else {
            throw new PatientException("Gerontologists only accept patients over 65 years old.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nGerontologist: " + (performsHouseCalls ? "performs house calls" : "no house calls")
                + " | visit fee=" + String.format("%02.2f", visitFee);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;

        }
        if (this == o) {

            return true;
        }

        if (o instanceof Gerontologist) {
            Gerontologist otherGerontologist = (Gerontologist) o;
            boolean bool = false;
            if ((Math.abs(this.visitFee - otherGerontologist.visitFee)) <= 0.5) {
                bool = true;
            }
            return super.equals(otherGerontologist)
                    && (this.performsHouseCalls == otherGerontologist.performsHouseCalls) && bool;
        }

        return false;
    }

}