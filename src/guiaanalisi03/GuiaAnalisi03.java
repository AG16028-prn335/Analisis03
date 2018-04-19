package guiaanalisi03;

import Metodos.MetodoHorner;
import Metodos.MetodoMuller;
import Metodos.MetodosGenerales;
import Metodos.Secante;
import Metodos.bairstow;

public class GuiaAnalisi03 {

    public static void main(String[] args) {
       // MetodoHorner m = new MetodoHorner();
        MetodosGenerales xq= new MetodosGenerales();
        //Secante d = new Secante();
        //bairstow b = new bairstow();
        String s1[]={"1","-1.1","2.3","0.5","3.3"};
        String s[]=xq.DivSintComp(-0.449999999,0.947364766,s1 , 4);
        for (int i = 0; i <s.length; i++) {
            System.out.println(s[i]);
        }
        //m.Horner("6x^3 +5x^2 +3x +1", -2,-1/7);
//        String s[]=d.secante("10sin(x)+3cos(x)",-0.5, 0);
//        s[1]+="%";
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
     //   String x[]={"1","-1.1","2.3","0.5","3.3"};
       // b.bairstow(-1, -1, x);
    }
    
}
