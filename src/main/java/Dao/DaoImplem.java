package Dao;


import org.springframework.stereotype.Component;

@Component("doa")
public class DaoImplem implements IDao {
    @Override
    public double getdata() {
        //recuperer la temp d'apres le capteur
        System.out.println("version bd");
        double temp=Math.random()*40;
        return temp;
    }
}
