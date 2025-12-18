import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private String address;
    private List<Research> researchEmployees = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addResearchEmployee(Research employee) {
        if (!researchEmployees.contains(employee)) {
            researchEmployees.add(employee);
        }
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Research> getResearchEmployees() {
        return researchEmployees;
    }

    @Override
    public String toString() {
        return "Institute: " + name + " (" + address + ")";
    }
}