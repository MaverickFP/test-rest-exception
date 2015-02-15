package test.ejb;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import test.model.Persona;
import test.myexception.MyException;

@Startup
@Singleton
public class SingletonEjb {

	private ArrayList<Persona> persone;
	
	public SingletonEjb() {
		this.persone = new ArrayList<Persona>();
	}
	
	
	@PostConstruct
	public void avvio(){
		System.out.println("Avvio Singleton Bean");
		//popolo array persone
		Persona p1 = new Persona(0,"Francesco", "Paris");
		Persona p2 = new Persona(1,"Luca","Toni");
		Persona p3 = new Persona(2,"Daniel","Ciofani");
		
		this.persone.add(p1);
		this.persone.add(p2);
		this.persone.add(p3);
	}
	
	
	
	public Persona trovaPersona(int id){
		Persona p = null;		
		Iterator iteratore = this.persone.iterator();
		while(iteratore.hasNext()){
			Persona pt = (Persona) iteratore.next();
			if(pt.getId() == id)
				p = pt;
		}		
		return p;
	}
	
	
	public Persona trovaPersonaIndiceArray(int id){
		Persona p = this.persone.get(id);
		return p;
	}
	
	
	

}
