public class Course {
    private String uniqueNumber;
    private String name;
    private int weeklyDuration;
    private Lecturer lecturer;

    public Course(String uniqueNumber, String name, int weeklyDuration) {
        this.uniqueNumber = uniqueNumber;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeeklyDuration() {
        return weeklyDuration;
    }

    public void setWeeklyDuration(int weeklyDuration) {
        this.weeklyDuration = weeklyDuration;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "Course: " + name + " (ID: " + uniqueNumber + ", Duration: " + weeklyDuration + " hours/week)";
    }
}