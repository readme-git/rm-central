package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import model.Block.BlockEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity(name = "Page")
public class PageEntity extends PanacheEntity {
    @OneToOne
    private UserEntity owner;
    @OneToMany
    private List<UserEntity> admin;
    @OneToMany
    private List<UserEntity> followers;
    @OneToOne(cascade = CascadeType.PERSIST)
    private GridEntity grid;

    public PageEntity(UserEntity owner, List<UserEntity> admin, List<UserEntity> followers, GridEntity grid) {
        this.owner = owner;
        this.admin = admin;
        this.followers = followers;
        this.grid = grid;
    }

    public PageEntity() {

    }

    public UserEntity getOwner() {
        return owner;
    }

    public List<UserEntity> getFollowers() {
        return followers;
    }

    public GridEntity getGrid() {
        return grid;
    }

    public List<UserEntity> getAdmin() {
        return admin;
    }
}
