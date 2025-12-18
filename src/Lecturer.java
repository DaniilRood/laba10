import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Research {
    private List<Course> courses = new ArrayList<>();

    public Lecturer(String socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email, researchArea);
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setLecturer(this);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Lecturer: " + getName() + " (Courses: " + courses.size() + ")";
    }
}