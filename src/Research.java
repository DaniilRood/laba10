import java.util.ArrayList;
import java.util.List;

public class Research extends Employee {
    private String researchArea;
    private List<Institute> institutes = new ArrayList<>();
    private List<ProjectParticipation> projectParticipations = new ArrayList<>();

    public Research(String socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email);
        this.researchArea = researchArea;
    }

    public void assignToInstitute(Institute institute) {
        if (!institutes.contains(institute)) {
            institutes.add(institute);
            institute.addResearchEmployee(this);
        }
    }

    public void joinProject(Project project, int hours) {
        ProjectParticipation participation = new ProjectParticipation(this, project, hours);
        projectParticipations.add(participation);
        project.addParticipation(participation);
    }
    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public List<ProjectParticipation> getProjectParticipations() {
        return projectParticipations;
    }

    @Override
    public String toString() {
        return "Research Employee: " + getName() + " (Area: " + researchArea + ")";
    }
}
