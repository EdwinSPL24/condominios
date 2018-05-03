package model.daosGEN;

import model.daosINT.GenericDao;
import model.entities.Inquilino;
import util.*;

public class InquilinoDao extends Conexion<Inquilino> implements GenericDao<Inquilino>{
	
	public InquilinoDao() {
		super(Inquilino.class);
	}

}