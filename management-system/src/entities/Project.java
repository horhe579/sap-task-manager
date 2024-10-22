package entities;

import java.util.UUID;

public class Project implements Entity {

    private UUID id;
    private String name;
    private String description;

//    public Project(UUID id, String name, String description) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//    }

    public Project(String name, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
    }

    public Project() {
    }

    @Override
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
