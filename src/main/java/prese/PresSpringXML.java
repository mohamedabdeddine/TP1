package prese;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Imetier metier = (Imetier) context.getBean("metier");
        System.out.println(metier.calcule());
    }
}
