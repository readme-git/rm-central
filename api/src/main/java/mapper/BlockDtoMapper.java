package mapper;

import dto.BlockCreateDto;
import dto.BlockDto;
import model.Block.Block;
import model.Position;
import model.Size;

import javax.inject.Singleton;
import java.util.List;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.stream.Collectors.toList;

@Singleton
public class BlockDtoMapper {

    public BlockDto toDto(Block block) {
        SimpleEntry<Integer, Integer> position = new SimpleEntry<>(block.getPosition().posX(), block.getPosition().posY());
        SimpleEntry<Integer, Integer> size = new SimpleEntry<>(block.getSize().width(), block.getSize().height());
        return new BlockDto(block.getId(),
                position,
                block.getPosition().isFixed(),
                size);
    }

    public List<BlockDto> toDto(List<Block> blocks) {
        return blocks.stream().map(this::toDto).collect(toList());
    }

    public Block toBo(BlockCreateDto blockDto) {
        Position position = new Position(blockDto.getPosition().getKey(),
                blockDto.getPosition().getValue(),
                blockDto.isFixed());
        Size size = new Size(blockDto.getSize().getKey(), blockDto.getSize().getValue());
        return new Block(position, size);
    }

    public List<Block> toBo(List<BlockCreateDto> blocks) {
        return blocks.stream().map(this::toBo).collect(toList());
    }
}
