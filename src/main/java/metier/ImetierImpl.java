package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ImetierImpl implements Imetier {
    //@Autowired
   // @Qualifier("dao2")
    private  IDao dao; //couplage faible

    public ImetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcule() {
        double tmp=dao.getdata();
        double results=tmp*55/1230;
        return results;
    }
     //injection d'un objet d'une classe qui implement l'interface idao dans la variable doa
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
