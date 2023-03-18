public class Faculty extends Employee {
    Course[] coursesTaught;
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
        coursesTaught[numCoursesTaught] = course;
        numCoursesTaught++;
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
}
