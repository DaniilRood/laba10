import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int numberOfEmployers;
    private List<Faculty> faculties = new ArrayList<>();
    private List<Employee> allEmployees = new ArrayList<>();

    public University(String name) {
        this.name = name;
        this.numberOfEmployers = 0;
    }

    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public void addEmployee(Employee employee) {
        if (!allEmployees.contains(employee)) {
            allEmployees.add(employee);
            numberOfEmployers++;
        }
    }

    public int calculateTotalEmployees() {
        return allEmployees.size();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(int numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    @Override
    public String toString() {
        return "University: " + name + " (Faculties: " + faculties.size() + ", Employees: " + numberOfEmployers + ")";
    }
}