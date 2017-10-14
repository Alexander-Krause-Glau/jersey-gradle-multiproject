package de.alexanderkrause.jersey.core.main;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("")
public class Application extends ResourceConfig {
	
	public Application() {
		
		// register core resources
		packages("de.alexanderkrause.jersey.core.resources");
		
		// register extensions resources
		packages("de.alexanderkrause.jersey.extension");
	}
	
}
