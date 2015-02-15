package test.myexception;

import javax.json.JsonObject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


public class MyException extends WebApplicationException {

	public MyException() {
		// TODO Auto-generated constructor stub
	}

	public MyException(JsonObject jsonObject) {
		super(Response.status(Response.Status.NOT_FOUND).entity(jsonObject).type(MediaType.APPLICATION_JSON).build());
	}

	public MyException(Response response) {
		super(response);
		// TODO Auto-generated constructor stub
	}

	public MyException(int status) {
		super(status);
		// TODO Auto-generated constructor stub
	}

	public MyException(Status status) {
		super(status);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Response response) {
		super(message, response);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, int status) {
		super(message, status);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Status status) {
		super(message, status);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause, Response response) {
		super(cause, response);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause, int status) {
		super(cause, status);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause, Status status)
			throws IllegalArgumentException {
		super(cause, status);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause, Response response) {
		super(message, cause, response);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause, int status) {
		super(message, cause, status);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause, Status status)
			throws IllegalArgumentException {
		super(message, cause, status);
		// TODO Auto-generated constructor stub
	}

}
