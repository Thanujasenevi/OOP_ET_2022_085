package LW3;

// Q4.java (Main class)
public class Q4 {
    public static void main(String[] args) {
        Student student1 = new Student("Thanuja Senevirathne", "Engineering Technology", "wwwww");

        Lecturer lecturer1 = new Lecturer("Dr.Lalitha", "Physics");

        Course course = new Course("Physics","21062",lecturer1);

        course.setCourseCode("ETEC 21062");
        course.setLecturer(lecturer1);

        System.out.println(student1.getStudentName() + " is a student that follows " + course.getCourseName() + " (" + course.getCourseCode() + ") and it is taught by " + course.getLecturer().getLecturerName());
    }
}
