
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

    public String [] DivSintetica(double xi,int n,String s[]){
        System.out.println("-----------div-------------");
        String a[][]=new String[3][s.length];
        int x=n;
        for (int i = 0; i <n; i++) {
            a[0][i]=s[i];
        }
         for (int i = 1; i <3; i++) {
             a[i][0]=s[0];
            for (int k = 1; k <x; k++) {
                a[i][k]=String.valueOf((xi*(Double.parseDouble(a[i][k-1])))+Double.parseDouble(a[i-1][k]));
            }
            x--;
            }
         for (int i = 0; i <3; i++) {
             for (int k = 0; k <s.length; k++) {
                 System.out.print(a[i][k]+"\t");
             }
             System.out.println();
        }
         System.out.println("-------------------------------");
         String v[]={a[1][n-1],a[2][x]};
        return v;
    }
    public double Ecuacion(String s, double n){
        j.addVariable("x", n);
        j.parseExpression(s);
        if(j.hasError()){
            System.out.println("Ecuancion no entendible:\n"+j.getErrorInfo());
        }
       return j.getValue();
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
    
    public String[] RegExp(String cad){
        String s="",ca[]= cad.split("x.");
        
        for (String ca1 : ca) {
        s+=ca1.replaceAll("\\d+.", "");  
        }
        String x[]= new String[s.length()];
        for (int i = 0; i <x.length; i++) {
            x[i]=String.valueOf(s.charAt(i));
        }
        return x;
    }
}
