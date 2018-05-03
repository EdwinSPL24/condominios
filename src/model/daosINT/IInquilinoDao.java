package model.daosINT;

import java.util.List;

import model.entities.Inquilino;

public interface IInquilinoDao {
	
	public Inquilino selectById(String id);

	public List<Inquilino> selectAll();

	public void insert(Inquilino objeto);
	
	public void update(Inquilino objeto);

	public void delete(Inquilino objeto);

}
