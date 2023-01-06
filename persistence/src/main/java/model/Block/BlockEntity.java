package model.Block;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import model.Position;
import model.Size;

import javax.persistence.Embedded;
import javax.persistence.Entity;


@Entity(name = "Block")
public class BlockEntity extends PanacheEntity {
    @Embedded
    private Position position;
    @Embedded
    private Size size;

    public BlockEntity(Position position, Size size) {
        this.position = position;
        this.size = size;
    }

    public BlockEntity() {

    }

    public Position getPosition() {
        return position;
    }

    public Size getSize() {
        return size;
    }
}
