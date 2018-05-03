package model.daosGEN;

import model.daosINT.GenericDao;
import model.entities.Asamblea;
import util.*;

public class AsambleaDao extends Conexion<Asamblea> implements GenericDao<Asamblea>{
	
	public AsambleaDao() {
		super(Asamblea.class);
	}

}
