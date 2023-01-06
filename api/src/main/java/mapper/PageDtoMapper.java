package mapper;

import dto.GridDto;
import dto.PageCreateDto;
import dto.PageDto;
import dto.UserDto;
import model.Page;
import model.User;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PageDtoMapper {

    private final UserDtoMapper userDtoMapper;
    private final GridDtoMapper gridDtoMapper;

    @Inject
    public PageDtoMapper(UserDtoMapper userDtoMapper, GridDtoMapper gridDtoMapper) {
        this.userDtoMapper = userDtoMapper;
        this.gridDtoMapper = gridDtoMapper;
    }

    public PageDto toDto(Page page) {
        UserDto owner = userDtoMapper.toDto(page.owner());
        GridDto grid = gridDtoMapper.toDto(page.grid());
        return new PageDto(page.id(), owner, grid);
    }

    public Page toBo(PageCreateDto pageDto) {
        User owner = userDtoMapper.toBo(pageDto.owner());
        return new Page(owner, pageDto.gridName());
    }
}
