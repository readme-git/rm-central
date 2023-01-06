package resource;

import dto.BlockCreateDto;
import dto.BlockDto;
import mapper.BlockDtoMapper;
import model.Block.Block;
import model.Grid;
import model.User;
import service.BlockService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/{user}/{grid}/block")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BlockResource {

    private final BlockService blockService;
    private final BlockDtoMapper blockDtoMapper;

    @Inject
    public BlockResource(BlockService blockService, BlockDtoMapper blockDtoMapper) {
        this.blockService = blockService;
        this.blockDtoMapper = blockDtoMapper;
    }

    @GET
    @Path("/{id}")
    public Response findOne(@PathParam("user") User user,
                            @PathParam("grid") Grid grid,
                            @PathParam("id") Long id) {
        Block block = blockService.findOne(id);
        return Response.ok(blockDtoMapper.toDto(block)).build();
    }

    @POST
    @Path("/{user}/{grid}")
    public Response create(@PathParam("user") User user,
                           @PathParam("grid") Grid grid,
                           BlockCreateDto blockDto) {
        Block block = blockDtoMapper.toBo(blockDto);
        BlockDto responseDto = blockDtoMapper.toDto(blockService.create(block));
        return Response.ok(responseDto).build();
    }

}


