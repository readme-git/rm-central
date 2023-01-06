package model;

import java.util.List;

import static java.util.Collections.emptyList;

public record Page(
        Long id,
        User owner,
        List<User> admin,
        List<User> followers,
        Grid grid
) {
    public Page(Long id, User owner, List<User> admin, List<User> followers, Grid grid) {
        this.id = id;
        this.owner = owner;
        this.admin = admin;
        this.followers = followers;
        this.grid = grid;
    }

    public Page(User owner, String gridName) {
        this(null, owner, emptyList(), emptyList(), new Grid(gridName));
    }
}
