package model.daosINT;

import java.util.List;

import model.entities.Propietario;

public interface IPropietarioDao {

	public Propietario selectById(String id);

	public List<Propietario> selectAll();

	public void insert(Propietario objeto);
	
	public void update(Propietario objeto);

	public void delete(Propietario objeto);

	
}
