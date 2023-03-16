package Dao;

public class DaoImplem implements IDao {
    @Override
    public double getdata() {
        //recuperer la temp d'apres le capteur
        double temp=Math.random()*40;
        return temp;
    }
}
