package model.daosGEN;

import model.daosINT.GenericDao;
import model.entities.Persona;
import util.*;

public class PersonaDao extends Conexion<Persona> implements GenericDao<Persona>{
	
	public PersonaDao() {
		super(Persona.class);
	}

}
