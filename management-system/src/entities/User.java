package entities;

import java.util.UUID;

public class User implements Entity {

    private UUID id;
    private String name;
    private String email;

    //dali trqbva constructor s id ili ne
//    public User(UUID id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }

    public User(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }

    public User() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
