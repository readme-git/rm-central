package model.Block;

import javax.persistence.Entity;

@Entity
public class TextBlockEntity extends BlockEntity {

    private String text;

    public TextBlockEntity(String text) {
        this.text = text;
    }

    public TextBlockEntity() {
    }
}
