package entities;

import enums.Severity;
import enums.TaskStatus;

public class Bug extends Task{

    private String affectedVersion;
    private Severity severity;

    public Bug(String title, String description, TaskStatus status, User assignedUser, Project project, String affectedVersion, Severity severity) {
        super(title, description, status, assignedUser, project);
        this.affectedVersion = affectedVersion;
        this.severity = severity;
    }

    public Bug() {

    }

    public String getAffectedVersion() {
        return affectedVersion;
    }

    public void setAffectedVersion(String affectedVersion) {
        this.affectedVersion = affectedVersion;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
}
