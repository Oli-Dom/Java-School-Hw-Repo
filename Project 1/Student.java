import java.util.Arrays;
import java.util.Objects;

public class Student extends Person {
    private static int numStudents = 0;
    private int studentID;
    private Course[] coursesTaken;
    private int numCoursesTaken;
    private boolean isGraduate;
    private String major;

    public Student() {
        super();
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        isGraduate = false;
        major = "undeclared";
        numStudents++;
        studentID = numStudents;
    }

    public Student(boolean isGraduate) {
        this();
        this.isGraduate = isGraduate;
    }

    public Student(String major, boolean isGraduate) {
        this();
        if (major != null && major != "") {
            this.major = major;
        } else {
            this.major = "undeclared";
        }
        this.isGraduate = isGraduate;
    }

    public Student(String name, int birthYear, String major, boolean isGraduate) {
        super(name, birthYear);
        coursesTaken = new Course[50];
        numCoursesTaken = 0;
        if (major != null && major != "") {
            this.major = major;
        } else {
            this.major = "undeclared";
        }

        this.isGraduate = isGraduate;
        numStudents++;
        studentID = numStudents;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public int getNumCoursesTaken() {
        return numCoursesTaken;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setIsGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourseTaken(Course course) {
        if (numCoursesTaken < coursesTaken.length) {
            coursesTaken[numCoursesTaken] = course;
            numCoursesTaken++;
        }
    }

    public void addCoursesTaken(Course[] courses) {
        for (Course course : courses) {
            addCourseTaken(course);
        }
    }

    public Course getCourseTaken(int index) {
        if (index >= 0 && index < numCoursesTaken) {
            return coursesTaken[index];
        } else {
            return null;
        }
    }

    public String getCourseTakenAsString(int index) {
        if (index >= 0 && index < numCoursesTaken) {
            return coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
        }
        return "";
    }

    public String getAllCoursesTakenAsString() {
        String allCourses = "";
        for (int i = 0; i < numCoursesTaken; i++) {
            allCourses += getCourseTakenAsString(i);
            if (i < numCoursesTaken - 1) {
                allCourses += ", ";
            }
        }
        return allCourses;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student otherStu = (Student) o;
        return this.studentID == otherStu.studentID &&
                Objects.equals(this.major, otherStu.major) &&
                this.numCoursesTaken == otherStu.numCoursesTaken &&
                this.isGraduate == otherStu.isGraduate &&
                Arrays.equals(this.coursesTaken, otherStu.coursesTaken);
    }

    @Override
    public String toString() {
        String status = isGraduate ? "Graduate" : "Undergraduate";
        String s = super.toString();
        String fs = s + String.format(
                " Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
                studentID,
                major, status, numCoursesTaken, getAllCoursesTakenAsString());
        return fs;
    }

    @Override
    public int compareTo(Person p) {
        Student otherStud = (Student) p;

        int originalCred = 0;
        int otherCred = 0;

        for (int i = 0; i < this.numCoursesTaken; i++) {
            originalCred += this.coursesTaken[i].getNumCredits();
        }

        for (int i = 0; i < otherStud.numCoursesTaken; i++) {
            otherCred += otherStud.coursesTaken[i].getNumCredits();
        }

        if (originalCred > otherCred) {
            return 1;
        }

        if (originalCred < otherCred) {
            return -1;
        }

        return 0;
    }
}
