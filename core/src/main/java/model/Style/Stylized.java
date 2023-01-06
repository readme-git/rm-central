package model.Style;

public interface Stylized {

    //Border
    short getBorderRadius();

    short getBorderSize();

    //Title
    short getTitleFontSize();

    boolean isTitleOutlined();

    //Colors
    RGBaColor getPrimaryColor();

    RGBaColor getSecondaryColor();

}
