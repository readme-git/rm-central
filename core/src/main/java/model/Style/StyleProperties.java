package model.Style;

public enum StyleProperties {
    //Border
    BORDER_RADIUS,
    BORDER_SIZE,
    //Title
    TITLE_FONT_SIZE,
    TITLE_OUTLINED,
    //Colors
    PRIMARY_COLOR,
    SECONDARY_COLOR;

    public String getValue() {
        return this.name().toUpperCase();
    }
}
