package entities;

import enums.Priority;
import enums.TaskStatus;

public class Feature extends Task{

    private Priority priority;
    private String stakeholder;//suppose its not a user

    public Feature(String title, String description, TaskStatus status, User assignedUser, Project project, Priority priority, String stakeholder) {
        super(title, description, status, assignedUser, project);
        this.priority = priority;
        this.stakeholder = stakeholder;
    }

    public Feature()
    {

    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getStakeholder() {
        return stakeholder;
    }

    public void setStakeholder(String stakeholder) {
        this.stakeholder = stakeholder;
    }
}
