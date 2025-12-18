import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String name;
    private Date startingDate;
    private Date endDate;
    private List<ProjectParticipation> participations = new ArrayList<>();

    public Project(String name, Date startingDate, Date endDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

    public void addParticipation(ProjectParticipation participation) {
        if (!participations.contains(participation)) {
            participations.add(participation);
        }
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<ProjectParticipation> getParticipations() {
        return participations;
    }

    @Override
    public String toString() {
        return "Project: " + name + " (" + startingDate + " - " + endDate + ")";
    }
}