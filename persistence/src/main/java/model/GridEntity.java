package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import model.Block.BlockEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "Grid")
public class GridEntity extends PanacheEntity {
    private String name;
    @OneToMany
    private List<BlockEntity> blocks;

    public GridEntity(String name, List<BlockEntity> blocks) {
        this.name = name;
        this.blocks = blocks;
    }

    public GridEntity() {
    }

    public String getName() {
        return name;
    }

    public List<BlockEntity> getBlocks() {
        return blocks;
    }
}
