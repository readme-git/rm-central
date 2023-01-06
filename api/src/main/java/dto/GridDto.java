package dto;

import java.util.List;

public class GridDto {

    private Long id;
    private String name;
    private List<BlockDto> blocks;

    public GridDto(Long id, String name, List<BlockDto> blocks) {
        this.id = id;
        this.name = name;
        this.blocks = blocks;
    }

    public GridDto(String name, List<BlockDto> blocks) {
        this.name = name;
        this.blocks = blocks;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<BlockDto> getBlocks() {
        return blocks;
    }
}
