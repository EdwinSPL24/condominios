package model.daosIMP;

import java.util.List;

import model.daosINT.IViviendaDao;
import model.entities.Vivienda;
import util.Conexion;

public class ViviendaDaoImp implements IViviendaDao {
	
	private Conexion con = null;
	
	public ViviendaDaoImp() {
		con = new Conexion();
		con.setC(Vivienda.class);
	}

	@Override
	public Vivienda selectById(String id) {
		Vivienda p = (Vivienda) con.find(id);		
		return p;
	}

	@Override
	public List<Vivienda> selectAll() {		
		return con.list();
	}

	@Override
	public void insert(Vivienda objeto) {
		con.insert(objeto);
		
	}

	@Override
	public void update(Vivienda objeto) {
		con.update(objeto);
		
	}

	@Override
	public void delete(Vivienda objeto) {
		con.delete(objeto);
		
	}

}
