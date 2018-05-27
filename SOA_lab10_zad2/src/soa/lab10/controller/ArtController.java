package soa.lab10.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/art")
public class ArtController {

    @GET
    public Response redirect() throws URISyntaxException {
        return Response.temporaryRedirect(new URI("/movies/1")).build();
    }

}