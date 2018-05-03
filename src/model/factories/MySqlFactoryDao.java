package model.factories;


import model.daosIMP.PersonaDaoImp;
import model.daosINT.IPersonaDao;
import util.FactoryDao;;

public class MySqlFactoryDao extends FactoryDao {
	
	@Override
    public IPersonaDao getPersonaDao() {
        return new PersonaDaoImp();
    }
	
}
