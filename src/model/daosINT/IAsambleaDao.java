package model.daosINT;

import java.util.List;

import model.entities.Asamblea;

public interface IAsambleaDao {
	
	public Asamblea selectById(String id);

	public List<Asamblea> selectAll();

	public void insert(Asamblea objeto);
	
	public void update(Asamblea objeto);

	public void delete(Asamblea objeto);

}
