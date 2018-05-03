package model.daosINT;

import java.util.List;

import model.entities.Persona;

public interface IPersonaDao {
	
	public Persona selectById(String id);

	public List<Persona> selectAll();

	public void insert(Persona objeto);
	
	public void update(Persona objeto);

	public void delete(Persona objeto);

}
