package metier;

import Dao.IDao;

public class ImetierImpl implements Imetier {
    private IDao dao; //couplage faible
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
