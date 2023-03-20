public class GeneralStaff extends Employee {

    private String duty;

    public GeneralStaff() {
        duty = "";
    }

    public GeneralStaff(String duty) {
        super();
        if (duty != null && duty != "") {

            this.duty = duty;
        } else {
            this.duty = "";
        }
    }

    public GeneralStaff(String deptName, String duty) {
        super(deptName);
        if (duty != null && duty != "") {

            this.duty = duty;
        } else {
            this.duty = "";
        }
    }

    public GeneralStaff(String name, int birthYear, String deptName, String duty) {
        super(name, birthYear, deptName);
        if (duty != null && duty != "") {

            this.duty = duty;
        } else {
            this.duty = "";
        }
    }

    public String getDuty() {
        return this.duty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }
        if (!(o instanceof GeneralStaff)) {
            return false;
        }

        if (super.equals(o)) {
            GeneralStaff otherGs = (GeneralStaff) o;
            if (this.getDuty().equals(otherGs.getDuty())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String fs = s + String.format(" GeneralStaff: Duty: %10s", duty);
        return fs;
    }

    public int compareTo(Person p) {
        return super.compareTo(p);
    }
}
