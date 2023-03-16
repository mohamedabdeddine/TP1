package prese;

import Dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Class.forName;

public class presentation2 {
    public static void main(String[] args) throws Exception {
        //dynamic method
        Scanner scanner=new Scanner(new File("config.txt"));

        String DaoClasseName = scanner.nextLine();
        Class cDao=Class.forName(DaoClasseName);
        IDao  dao=(IDao)  cDao.newInstance();
        System.out.println(dao.getdata());

        String metierClasseName = scanner.nextLine();
        Class cMetier= forName(metierClasseName);
        Imetier metier=(Imetier)  cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("res est :"+metier.calcule());

    }
}
