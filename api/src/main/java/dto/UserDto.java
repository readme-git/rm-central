package dto;

public class UserDto {

    private Long id;
    private final String username;

    public UserDto(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserDto(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
