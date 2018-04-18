package guiaanalisi03;

import Metodos.MetodoHorner;
import Metodos.MetodoMuller;
import Metodos.MetodosGenerales;
import Metodos.Secante;

public class GuiaAnalisi03 {

    public static void main(String[] args) {
        MetodoHorner m = new MetodoHorner();
        MetodosGenerales x= new MetodosGenerales();
        Secante d = new Secante();
        //x.RegExp("6x^3+5x^2+3x+1");
       // m.Horner("6x^3+5x^2+3x+1", -2,-1/7);
        String s[]=d.secante("10sin(x)+3cos(x)",-0.5, 0);
        s[1]+="%";
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
    
}
