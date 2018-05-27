package soa.lab10;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import soa.lab10.model.Cat;

/**
 * Servlet implementation class CatController
 */
@Path("/cats")
public class CatController{
	
	private static CatsManager manager = new CatsManager();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cat> getCats(){
		return manager.getCats();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getCat(@PathParam("id") int id) {
		if(manager.getCats().stream().anyMatch(cat -> cat.getId() == id)) {
			return Response.ok(manager.getCats().stream().filter(cat -> cat.getId() == id).findAny().get()).build();
		}
		else {
			return Response.noContent().build();
		}
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response addCat(Cat cat) {
		List<Cat> cats = manager.getCats();
		cats.add(cat);
		manager.setCats(cats);
		manager.getCats().stream().forEach(System.out::println);
		return Response.ok().build();
		
	}
	
	@Path("/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateCat(Cat item, @PathParam("id") int id) {
		if (!manager.getCats().stream().anyMatch(cat -> cat.getId() == id)) {
			return Response.noContent().build();
		} 
		else {
			Cat cat0 = manager.getCats().stream().filter(cat -> cat.getId() == id).findAny().get();
			List<Cat> cats = manager.getCats();
			cats.remove(cat0);
			cats.add(item);
			manager.setCats(cats);
			return Response.ok().build();
		}
    }
	
	
	@DELETE
	@Path("/{id}")
	public void deleteCat(@PathParam("id") int id) {
		List<Cat> cats = manager.getCats();
		cats.remove(manager.getCats().stream().filter(cat -> cat.getId() == id).findAny().get());
		manager.setCats(cats);
		manager.getCats().stream().forEach(System.out::println);
		
	}
}
