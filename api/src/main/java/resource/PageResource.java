package resource;

import dto.PageDto;
import mapper.PageDtoMapper;
import model.Page;
import model.User;
import service.PageService;
import service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{username}/{grid}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PageResource {

    private final PageService pageService;
    private final UserService userService;
    private final PageDtoMapper pageDtoMapper;

    @Inject
    public PageResource(PageService pageService,
                        UserService userService,
                        PageDtoMapper pageDtoMapper) {
        this.pageService = pageService;
        this.userService = userService;
        this.pageDtoMapper = pageDtoMapper;
    }

    @GET
    public Response findOne(@PathParam("username") String username,
                            @PathParam("grid") String grid) {
        return pageService.findOne(username, grid)
                .map(page -> Response.ok(pageDtoMapper.toDto(page)))
                .orElse(Response.status(Response.Status.NOT_FOUND))
                .build();
    }

    @POST
    public Response create(@PathParam("username") String username,
                           @PathParam("grid") String grid) {
        User owner = userService.findByUsername(username);
        Page page = new Page(owner, grid);
        PageDto responseDto = pageDtoMapper.toDto(pageService.create(page));
        return Response.ok(responseDto).build();
    }
}
