package test.endpoint;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import test.ejb.SingletonEjb;
import test.model.Persona;
import test.myexception.MyException;


@Path("/persona")
public class RestEndpoint {
	
	@EJB
	private SingletonEjb service;

	public RestEndpoint() {		
	}
	
	
	
	
	@GET
	@Path("/ping")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPing(){
		return Response.ok("Ping").build();
	}
	
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersona(@PathParam("id") int id){
		Persona p = this.service.trovaPersona(id);
		if(p == null){
			JsonObject object = Json.createObjectBuilder()
					.add("errorCode", 10)
					.add("errorMessage", "Persona non trovata")
					.build();
			throw new MyException(object);
		}	
		else
		return Response.ok(p).build();
	}
	
	
	
	@GET
	@Path("/info/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersona2(@PathParam("id") int id){
		Persona p = this.service.trovaPersonaIndiceArray(id);
		return Response.ok(p).build();
	}

	
}
