package LW3;

public class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;
    private Course course;

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}
