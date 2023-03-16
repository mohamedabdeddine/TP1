package prese;

import metier.Imetier;
import org.springframework.aop.support.annotation.AnnotationMethodMatcher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotations {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext("Dao","metier","ext");
        Imetier metier=context.getBean(Imetier.class);
        System.out.println(metier.calcule());
    }
}
