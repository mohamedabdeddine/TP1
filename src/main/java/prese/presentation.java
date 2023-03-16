package prese;

import Dao.DaoImplem;
import metier.ImetierImpl;

public class presentation {
    public static void main(String[] args){
        //injection satatic
        DaoImplem dao = new DaoImplem();
        ImetierImpl metier= new ImetierImpl(dao);
       // metier.setDao(dao);
        System.out.println("res est : "+metier.calcule()); //NullPointerException appel a une methode d'un objet null

    }
}
