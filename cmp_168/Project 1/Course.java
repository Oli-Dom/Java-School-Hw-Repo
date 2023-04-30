public class Course implements Comparable<Course> {
    private boolean isGraduateCourse;
    private int courseNum;
    private String courseDept;
    private int numCredits;

    public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
        this.isGraduateCourse = isGraduateCourse;
        if (courseNum >= 0) {
            this.courseNum = courseNum;
        } else {
            this.courseNum = 0;
        }
        if (courseDept != "" && courseDept != null) {
            this.courseDept = courseDept;
        } else {
            this.courseDept = "";
        }
        if (numCredits >= 0) {
            this.numCredits = numCredits;
        } else {
            this.numCredits = 0;
        }
    }

    public boolean isGraduateCourse() {
        return this.isGraduateCourse;
    }

    public int getCourseNum() {
        return this.courseNum;
    }

    public String getCourseDept() {
        return this.courseDept;
    }

    public int getNumCredits() {
        return this.numCredits;
    }

    public String getCourseName() {
        if (this.isGraduateCourse) {
            return "G" + this.courseDept + this.courseNum;
        }

        return "U" + this.courseDept + this.courseNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof Course) {
            Course otherCourse = (Course) o;
            if (this.courseDept.equals(otherCourse.courseDept)) {
                if (this.numCredits == otherCourse.numCredits) {
                    if (this.getCourseName().equals(otherCourse.getCourseName())) {
                        if (this.courseNum == otherCourse.courseNum) {
                            if (this.isGraduateCourse == otherCourse.isGraduateCourse) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String status = isGraduateCourse ? "Graduate" : "Undergraduate";
        return String.format("Course: %3s-%3d | Number of Credits: %02d | %s", courseDept,
                courseNum, numCredits, status);
    }

    @Override
    public int compareTo(Course otherCourse) {

        if (this.getCourseNum() < otherCourse.getCourseNum()) {
            return -1;
        }

        else if (this.getCourseNum() > otherCourse.getCourseNum()) {
            return 1;

        } else {
            return 0;
        }
    }
}