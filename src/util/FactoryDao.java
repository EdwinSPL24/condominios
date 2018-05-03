package util;

import model.daosINT.IPersonaDao;
import model.factories.MySqlFactoryDao;


public abstract class FactoryDao {
	
	public static final int MYSQL_FACTORY = 1;

    public abstract IPersonaDao getPersonaDao();

    public static FactoryDao getFactory(int claveFactory){
        switch(claveFactory){
            case MYSQL_FACTORY:
                return new MySqlFactoryDao();
            default:
                throw new IllegalArgumentException();
        }
    }

}
