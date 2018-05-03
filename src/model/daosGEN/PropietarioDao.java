package model.daosGEN;

import model.daosINT.GenericDao;
import model.entities.Propietario;
import util.Conexion;

public class PropietarioDao extends Conexion<Propietario> implements GenericDao<Propietario>{
	
	public PropietarioDao() {
		super(Propietario.class);
	}

}
