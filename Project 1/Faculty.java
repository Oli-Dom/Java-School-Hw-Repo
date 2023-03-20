import java.util.Arrays;

public class Faculty extends Employee {
    private Course[] coursesTaught;
    private int numCoursesTaught;
    private boolean isTenured;

    public Faculty() {
        super();
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        isTenured = false;
    }

    public Faculty(boolean isTenured) {
        super();
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public Faculty(String deptName, boolean isTenured) {
        super(deptName);
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
        super(name, birthYear, deptName);
        coursesTaught = new Course[100];
        numCoursesTaught = 0;
        this.isTenured = isTenured;
    }

    public boolean isTenured() {
        return isTenured;
    }

    public int getNumCoursesTaught() {
        return numCoursesTaught;
    }

    public void setIsTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public void addCourseTaught(Course course) { // Parameter is the course itself
        if (numCoursesTaught != 100) {

            coursesTaught[numCoursesTaught] = course;
            numCoursesTaught++;
        }
    }

    public void addCoursesTaught(Course[] courses) {
        for (Course course : courses) {
            addCourseTaught(course);
        }
    }

    public Course getCourseTaught(int index) {
        if (index < 0 || index >= numCoursesTaught) {
            return null;
        }
        return coursesTaught[index];
    }

    public String getCourseTaughtAsString(int index) {
        if (index < 0 || index >= numCoursesTaught) {
            return "";
        }
        return coursesTaught[index].getCourseDept() +
                "-" + coursesTaught[index].getCourseNum();
    }

    public String getAllCoursesTaughtAsString() {
        String s = "";
        for (int i = 0; i < numCoursesTaught; i++) {
            s = (getCourseTaughtAsString(i));
            if (i < numCoursesTaught - 1) {
                s += ",";
            }
        }

        return s;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if ((!(o instanceof Faculty))) {
            return false;
        }
        if (super.equals(o)) {

            Faculty otherFalc = (Faculty) o;
            return this.isTenured == otherFalc.isTenured && this.numCoursesTaught == otherFalc.numCoursesTaught
                    && Arrays.equals(this.coursesTaught, otherFalc.coursesTaught);
        }
        return false;
    }

    @Override
    public String toString() {
        String s = super.toString();
        String tenStat = isTenured ? "Is Tenured" : "Not Tenured";
        String coursesTaught = getAllCoursesTaughtAsString();
        if (coursesTaught == null) {
            coursesTaught = "";
        }
        String fs = s + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", tenStat,
                numCoursesTaught, coursesTaught);
        return fs;
    }

    @Override
    public int compareTo(Person p) {
        Faculty f = (Faculty) p;
        if (this.getNumCoursesTaught() < f.getNumCoursesTaught()) {
            return -1;
        }

        else if (this.getNumCoursesTaught() > f.getNumCoursesTaught()) {
            return 1;

        } else {
            return 0;
        }
    }
}
