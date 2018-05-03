package model.daosGEN;

import model.daosINT.GenericDao;
import model.entities.Vivienda;
import util.*;

public class ViviendaDao extends Conexion<Vivienda> implements GenericDao<Vivienda>{
	
	public ViviendaDao() {
		super(Vivienda.class);
	}

}