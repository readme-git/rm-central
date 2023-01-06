package mapper;

import dto.BlockDto;
import dto.GridDto;
import model.Grid;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class GridDtoMapper {

    private final BlockDtoMapper blockDtoMapper;

    @Inject
    public GridDtoMapper(BlockDtoMapper blockDtoMapper) {
        this.blockDtoMapper = blockDtoMapper;
    }

    public GridDto toDto(Grid grid) {
        List<BlockDto> blocks = blockDtoMapper.toDto(grid.blocks());
        return new GridDto(grid.id(), grid.name(), blocks);
    }
}
