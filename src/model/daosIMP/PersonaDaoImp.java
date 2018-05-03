package model.daosIMP;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.daosINT.IPersonaDao;
import model.entities.Persona;
import util.Conexion;

public class PersonaDaoImp implements IPersonaDao{
	
	private Conexion con = null;
	
	public PersonaDaoImp() {
		con = new Conexion();
		con.setC(Persona.class);
	}

	@Override
	public Persona selectById(String id) {
		Persona p = (Persona) con.find(id);		
		return p;
	}

	@Override
	public List<Persona> selectAll() {		
		return con.list();
	}

	@Override
	public void insert(Persona objeto) {
		con.insert(objeto);
		
	}

	@Override
	public void update(Persona objeto) {
		con.update(objeto);
		
	}

	@Override
	public void delete(Persona objeto) {
		con.delete(objeto);
		
	}
	
	

}
