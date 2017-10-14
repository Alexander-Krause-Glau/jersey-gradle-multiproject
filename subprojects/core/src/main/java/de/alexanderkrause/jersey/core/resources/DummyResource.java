package de.alexanderkrause.jersey.core.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("core/dummy")
public class DummyResource {
	
	@GET
	@Path("/show")
	public String show() {
		return "Hello from core dummy resource.";
	}

}
