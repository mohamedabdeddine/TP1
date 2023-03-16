package ext;

import Dao.IDao;

public class DaoImplemtWebService implements IDao {
    /**
     * @return
     */
    @Override
    public double getdata() {
        System.out.println("web service");
        return 999;
    }
}
