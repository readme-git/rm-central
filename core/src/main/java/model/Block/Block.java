package model.Block;

import model.Position;
import model.Style.RGBaColor;
import model.Size;
import model.Style.Stylized;

public class Block implements Stylized {

    private Long id;
    private final Position position;
    private final Size size;

    public Block(Long id, Position position, Size size) {
        this.id = id;
        this.position = position;
        this.size = size;
    }

    public Block(Position position, Size size) {
        this.position = position;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public short getBorderRadius() {
        return 0;
    }

    @Override
    public short getBorderSize() {
        return 0;
    }

    @Override
    public short getTitleFontSize() {
        return 0;
    }

    @Override
    public boolean isTitleOutlined() {
        return false;
    }

    @Override
    public RGBaColor getPrimaryColor() {
        return null;
    }

    @Override
    public RGBaColor getSecondaryColor() {
        return null;
    }
}
