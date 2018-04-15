package Metodos;
import org.nfunk.jep.JEP;
public class MetodosGenerales {
   JEP j = new JEP();
    public MetodosGenerales() {
        j.addStandardConstants();
        j.addStandardFunctions();
        j.addComplex();
        j.setImplicitMul(true);
    }

    public String DivSinteticaR(double xi){
        String rs="";
        return rs;
    }
    public double Ecuacion(String s, double n){
        double res;
        j.addVariable("x", n);
        j.parseExpression(s);
        if(j.hasError()){
            System.out.println(j.getErrorInfo());
        }
       return res=j.getValue();
    }
    
    public double Discriminante(double a,double b,double c){
        double rest;
        j.addVariable("a", a);
        j.addVariable("b", b);
        j.addVariable("c", c);
        j.parseExpression("b^2 -4a c");
        if(j.hasError()){
            System.out.println(j.getErrorInfo());
        }
        rest=j.getValue();
        rest=Math.sqrt(rest);
        return rest;
    }
}
