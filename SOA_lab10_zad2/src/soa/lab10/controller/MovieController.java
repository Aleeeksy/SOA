package soa.lab10.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import soa.lab10.model.MovieManager;

@Path("/movies")
public class MovieController {
	
	private static MovieManager manager = new MovieManager();
	
	@GET
	@Path("/{id}")
	public Response getMovie(@PathParam("id") int id) {
		return manager.getMovies()
						.stream()
						.filter(m -> m.getId() == id)
						.findFirst()
						.map(m -> Response.ok(m).build())
						.orElse(Response.noContent().build());

	}
	
	@GET
	public Response getMovieByTitle(@QueryParam("title") String title) {
		return manager.getMovies()
						.stream()
						.filter(m -> m.getTitle().equals(title))
						.findFirst()
						.map(m -> Response.ok(m).build())
						.orElse(Response.noContent().build());
	}
	
	
	@DELETE
	@Path("/{id}")
	public void deleteMovie(@PathParam("id") int id) {
		manager.getMovies()
				.stream()
				.filter(m -> m.getId() == id)
				.findFirst()
				.ifPresent(manager.getMovies()::remove);
	}
}
