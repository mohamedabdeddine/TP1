package ext;

import Dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImplem2 implements IDao {

    @Override
    public double getdata() {
        System.out.println("version capteur");
        double temp=1000;
        return temp;
    }
}
