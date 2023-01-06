package model;

import model.Block.Block;

import java.util.List;

import static java.util.Collections.emptyList;

public record Grid(
        Long id,
        String name,
        List<Block> blocks
) {
    public Grid(Long id, String name, List<Block> blocks) {
        this.id = id;
        this.name = name;
        this.blocks = blocks;
    }

    public Grid(String name) {
        this(null, name, emptyList());
    }
}
