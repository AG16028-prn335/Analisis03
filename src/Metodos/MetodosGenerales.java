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
         
    public static String DivSinteticaR(double xi){
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
}
