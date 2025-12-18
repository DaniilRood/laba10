public class AdministrativePersonal extends Employee {
    private String department;

    public AdministrativePersonal(String socialSecurityNumber, String name, String email, String department) {
        super(socialSecurityNumber, name, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Administrative Personal: " + getName() + " (Dept: " + department + ")";
    }
}
