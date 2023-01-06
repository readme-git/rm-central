package dto;

import static java.util.AbstractMap.SimpleEntry;

public class BlockCreateDto {
    private final SimpleEntry<Integer, Integer> position;
    private final SimpleEntry<Integer, Integer> size;
    private final boolean isFixed;

    public BlockCreateDto(SimpleEntry<Integer, Integer> position,
                          SimpleEntry<Integer, Integer> size,
                          boolean isFixed) {
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
}
