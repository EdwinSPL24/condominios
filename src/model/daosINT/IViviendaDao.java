package model.daosINT;

import java.util.List;

import model.entities.Persona;
import model.entities.Vivienda;

public interface IViviendaDao {
	
	public Vivienda selectById(String id);

	public List<Vivienda> selectAll();

	public void insert(Vivienda objeto);
	
	public void update(Vivienda objeto);

	public void delete(Vivienda objeto);

}
