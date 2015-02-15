package test.endpoint;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import test.myexception.OutArrayRange;

@ApplicationPath("rs")
public class ApplicationConfig extends Application {
	
	private final Set<Class<?>> classes;

	public ApplicationConfig() {
		HashSet<Class<?>> c = new HashSet<>();
		c.add(RestEndpoint.class);
		c.add(OutArrayRange.class);
		c.add(MOXyJsonProvider.class);
		classes = Collections.unmodifiableSet(c);
	}
	
	
	@Override
	public Set<Class<?>> getClasses(){
		return classes;
	}
	
	
	

}
