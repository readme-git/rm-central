package mapper;

import model.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class PageEntityMapper {

    private final GridEntityMapper gridEntityMapper;
    private final UserEntityMapper userEntityMapper;

    @Inject
    public PageEntityMapper(GridEntityMapper gridEntityMapper, UserEntityMapper userEntityMapper) {
        this.gridEntityMapper = gridEntityMapper;
        this.userEntityMapper = userEntityMapper;
    }

    public PageEntity toEntity(Page page) {
        GridEntity grid = gridEntityMapper.toEntity(page.grid());
        UserEntity owner = userEntityMapper.toEntity(page.owner());
        List<UserEntity> admin = userEntityMapper.toEntity(page.admin());
        List<UserEntity> followers = userEntityMapper.toEntity(page.followers());
        return new PageEntity(owner, admin, followers, grid);
    }

    public Page toBo(PageEntity pageEntity) {
        Grid grid = gridEntityMapper.toBo(pageEntity.getGrid());
        User owner = userEntityMapper.toBo(pageEntity.getOwner());
        List<User> admin = userEntityMapper.toBo(pageEntity.getAdmin());
        List<User> followers = userEntityMapper.toBo(pageEntity.getFollowers());
        return new Page(pageEntity.id, owner, admin, followers, grid);
    }
}
