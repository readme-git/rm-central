package mapper;

import model.Block.Block;
import model.Block.BlockEntity;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class BlockEntityMapper {

    public BlockEntity toEntity(Block block) {
        return new BlockEntity(block.getPosition(), block.getSize());
    }

    public List<BlockEntity> toEntity(List<Block> blocks) {
        return blocks.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public Block toBo(BlockEntity blockEntity) {
        return new Block(blockEntity.id, blockEntity.getPosition(), blockEntity.getSize());
    }

    public List<Block> toBo(List<BlockEntity> blocksEntity) {
        return blocksEntity.stream().map(this::toBo).collect(Collectors.toList());
    }
}
