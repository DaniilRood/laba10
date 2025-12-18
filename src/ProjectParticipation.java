public class ProjectParticipation {
    private Research researchEmployee;
    private Project project;
    private int hours;

    public ProjectParticipation(Research researchEmployee, Project project, int hours) {
        this.researchEmployee = researchEmployee;
        this.project = project;
        this.hours = hours;
    }
    public Research getResearchEmployee() {
        return researchEmployee;
    }

    public void setResearchEmployee(Research researchEmployee) {
        this.researchEmployee = researchEmployee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Participation: " + researchEmployee.getName() + " in " + project.getName() + " (" + hours + " hours)";
    }
}
