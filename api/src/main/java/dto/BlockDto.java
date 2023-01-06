package dto;

import static java.util.AbstractMap.SimpleEntry;

public class BlockDto {
    private Long id;
    private final SimpleEntry<Integer, Integer> position;
    private final boolean isFixed;
    private final SimpleEntry<Integer, Integer> size;

    public BlockDto(Long id, SimpleEntry<Integer, Integer> position, boolean isFixed, SimpleEntry<Integer, Integer> size) {
        this.id = id;
        this.position = position;
        this.isFixed = isFixed;
        this.size = size;
    }

    public BlockDto(SimpleEntry<Integer, Integer> position, boolean isFixed, SimpleEntry<Integer, Integer> size) {
        this.position = position;
        this.isFixed = isFixed;
        this.size = size;
    }

    public SimpleEntry<Integer, Integer> getPosition() {
        return position;
    }

    public SimpleEntry<Integer, Integer> getSize() {
        return size;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public Long getId() {
        return id;
    }
}
