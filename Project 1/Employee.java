public class Employee extends Person {
    private String deptName;
    private static int numEmployees;
    private int employeeID;

    public Employee() {
        super();
        deptName = "";
        employeeID = ++numEmployees;
    }

    public Employee(String deptName) {
        super();
        if (deptName != null && deptName != "") {

            this.deptName = deptName;
        } else {
            this.deptName = "";
        }
        employeeID = ++numEmployees;
    }

    public Employee(String name, int birthYear, String deptName) {

        super(name, birthYear);

        if (deptName != null && deptName != "") {

            this.deptName = deptName;
        } else {
            this.deptName = "";
        }
        employeeID = ++numEmployees;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public static int getNumEmployees() {
        return numEmployees;
    }

    public int getEmployeID() {
        return this.employeeID;
    }

    public void setDeptName(String deptName) {
        if (deptName != null && deptName != "") {

            this.deptName = deptName;
        } else {
            this.deptName = "";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Employee otherEmp = (Employee) o;
            if (this.deptName.equals(otherEmp.deptName)) {
                if (this.employeeID == otherEmp.employeeID) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String fs = s + String.format("Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
        return fs;
    }

    @Override
    public int compareTo(Person p) {
        Employee e = (Employee) p;
        if (this.getEmployeID() < e.getEmployeID()) {
            return -1;
        }

        else if (this.getEmployeID() > e.getEmployeID()) {
            return 1;

        } else {
            return 0;
        }
    }
}
