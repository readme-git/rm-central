package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import model.Block.BlockEntity;

import javax.inject.Singleton;

@Singleton
public class BlockRepository implements PanacheRepository<BlockEntity> {
}