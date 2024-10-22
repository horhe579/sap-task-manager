package entities;

import enums.TaskStatus;

import java.util.UUID;

public abstract class Task implements Entity{

    private UUID id;
    private String title;
    private String description;
    private TaskStatus status;
    private User assignedUser;
    private Project project;

    public Task(String title, String description, TaskStatus status, User assignedUser, Project project) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.status = status;
        this.assignedUser = assignedUser;
        this.project = project;
    }

    public Task() {
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
