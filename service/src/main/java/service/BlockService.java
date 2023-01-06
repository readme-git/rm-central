package service;


import mapper.BlockEntityMapper;
import model.Block.Block;
import model.Block.BlockEntity;
import repository.BlockRepository;

import javax.inject.Singleton;

@Singleton
public class BlockService {

    private final BlockRepository blockRepository;
    private final BlockEntityMapper blockEntityMapper;

    public BlockService(BlockRepository blockRepository, BlockEntityMapper blockEntityMapper) {
        this.blockRepository = blockRepository;
        this.blockEntityMapper = blockEntityMapper;
    }

    public Block findOne(Long id) {
        BlockEntity blockEntity = blockRepository.findByIdOptional(id).orElseThrow();
        return blockEntityMapper.toBo(blockEntity);
    }

    public Block create(Block block) {
        BlockEntity blockEntity = blockEntityMapper.toEntity(block);
        blockRepository.persist(blockEntity);
        return block;
    }
}
