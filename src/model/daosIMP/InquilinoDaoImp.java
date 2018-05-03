package model.daosIMP;

import java.util.List;

import model.daosINT.IInquilinoDao;
import model.entities.Inquilino;
import util.Conexion;

public class InquilinoDaoImp implements IInquilinoDao {
	
private Conexion con = null;
	
	public InquilinoDaoImp() {
		con = new Conexion();
		con.setC(Inquilino.class);
	}

	@Override
	public Inquilino selectById(String id) {
		Inquilino p = (Inquilino) con.find(id);		
		return p;
	}

	@Override
	public List<Inquilino> selectAll() {		
		return con.list();
	}

	@Override
	public void insert(Inquilino objeto) {
		con.insert(objeto);
		
	}

	@Override
	public void update(Inquilino objeto) {
		con.update(objeto);
		
	}

	@Override
	public void delete(Inquilino objeto) {
		con.delete(objeto);
		
	}

}
