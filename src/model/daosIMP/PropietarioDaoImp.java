package model.daosIMP;

import java.util.List;

import model.daosINT.GenericDao;
import model.daosINT.IPropietarioDao;
import model.entities.Propietario;
import util.Conexion;

public class PropietarioDaoImp implements IPropietarioDao{
	
	private Conexion con = null;
	
	public PropietarioDaoImp() {
		con = new Conexion();
		con.setC(Propietario.class);
	}

	@Override
	public Propietario selectById(String id) {
		Propietario p = (Propietario) con.find(id);		
		return p;
	}

	@Override
	public List<Propietario> selectAll() {		
		return con.list();
	}

	@Override
	public void insert(Propietario objeto) {
		con.insert(objeto);
		
	}

	@Override
	public void update(Propietario objeto) {
		con.update(objeto);
		
	}

	@Override
	public void delete(Propietario objeto) {
		con.delete(objeto);
		
	}

}
