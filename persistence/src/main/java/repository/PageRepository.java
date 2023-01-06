package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import model.PageEntity;

import javax.inject.Singleton;

@Singleton
public class PageRepository implements PanacheRepository<PageEntity> {
}
