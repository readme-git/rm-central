package service;

import mapper.PageEntityMapper;
import model.Page;
import model.PageEntity;
import repository.PageRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.Optional;

@Singleton
public class PageService {
    private final PageRepository pageRepository;
    private final PageEntityMapper pageEntityMapper;

    @Inject
    public PageService(PageRepository pageRepository, PageEntityMapper pageEntityMapper) {
        this.pageRepository = pageRepository;
        this.pageEntityMapper = pageEntityMapper;
    }

    public Optional<Page> findOne(String username, String grid) {
        return pageRepository.findByIdOptional(1L).map(pageEntityMapper::toBo);
    }

    @Transactional
    public Page create(Page page) {
        PageEntity pageEntity = pageEntityMapper.toEntity(page);
        pageRepository.persist(pageEntity);
        return page;
    }
}
