package model.daosIMP;

import java.util.List;

import model.daosINT.IAsambleaDao;
import model.entities.Asamblea;
import util.Conexion;

public class AsambleaDaoImp implements IAsambleaDao{
	
private Conexion con = null;
	
	public AsambleaDaoImp() {
		con = new Conexion();
		con.setC(Asamblea.class);
	}

	@Override
	public Asamblea selectById(String id) {
		Asamblea p = (Asamblea) con.find(id);		
		return p;
	}

	@Override
	public List<Asamblea> selectAll() {		
		return con.list();
	}

	@Override
	public void insert(Asamblea objeto) {
		con.insert(objeto);
		
	}

	@Override
	public void update(Asamblea objeto) {
		con.update(objeto);
		
	}

	@Override
	public void delete(Asamblea objeto) {
		con.delete(objeto);
		
	}

}
