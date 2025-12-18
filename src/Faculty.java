import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Employee dean;
    private List<Institute> institutes = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public void addInstitute(Institute institute) {
        if (!institutes.contains(institute)) {
            institutes.add(institute);
        }
    }

    public String getName() {
        return name;
    }

    public Employee getDean() {
        return dean;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    @Override
    public String toString() {
        return "Faculty: " + name + (dean != null ? " (Dean: " + dean.getName() + ")" : "");
    }
}