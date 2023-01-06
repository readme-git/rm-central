package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity(name = "Users")
public class UserEntity extends PanacheEntity {
    private String username;

    public UserEntity(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserEntity() {

    }

    public String getUsername() {
        return username;
    }
}

