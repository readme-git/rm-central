package mapper;

import model.Block.Block;
import model.Block.BlockEntity;
import model.Grid;
import model.GridEntity;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class GridEntityMapper {

    private final BlockEntityMapper blockEntityMapper;

    @Inject
    public GridEntityMapper(BlockEntityMapper blockEntityMapper) {
        this.blockEntityMapper = blockEntityMapper;
    }

    public GridEntity toEntity(Grid grid) {
        List<BlockEntity> blocks = blockEntityMapper.toEntity(grid.blocks());
        return new GridEntity(grid.name(), blocks);
    }

    public Grid toBo(GridEntity gridEntity) {
        List<Block> blocks = blockEntityMapper.toBo(gridEntity.getBlocks());
        return new Grid(gridEntity.id, gridEntity.getName(), blocks);
    }
}
