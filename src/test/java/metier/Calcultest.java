package metier;
import org.junit.Assert;
import org.junit.Test;



public class Calcultest {
    //classe a  tester
    private Calcul calcul;
    //creer un senario de teste
    @Test
    public void testSomme(){
       calcul= new Calcul();
       double a =650;
       double b=6;
       double expected=656;
       double res= calcul.somme(a,b);
       Assert.assertTrue(res==expected);

    }
}
