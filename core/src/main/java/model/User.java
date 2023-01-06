package model;

public record User(
        Long id,
        String username
) {
    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(String username) {
        this(null, username);
    }
}
