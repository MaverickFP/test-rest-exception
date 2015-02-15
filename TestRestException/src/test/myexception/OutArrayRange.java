package test.myexception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class OutArrayRange implements ExceptionMapper<java.lang.IndexOutOfBoundsException>{

	public OutArrayRange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response toResponse(IndexOutOfBoundsException arg0) {		
		return Response.status(404).entity(arg0.getMessage()).type(MediaType.TEXT_PLAIN).build();
	}

}
