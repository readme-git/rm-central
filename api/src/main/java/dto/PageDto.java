package dto;

public class PageDto {
    private Long id;
    private final UserDto owner;
    private final GridDto grid;

    public PageDto(Long id, UserDto owner, GridDto grid) {
        this.id = id;
        this.owner = owner;
        this.grid = grid;
    }

    public PageDto(UserDto owner, GridDto grid) {
        this.owner = owner;
        this.grid = grid;
    }

    public Long getId() {
        return id;
    }

    public UserDto getOwner() {
        return owner;
    }

    public GridDto getGrid() {
        return grid;
    }
}
