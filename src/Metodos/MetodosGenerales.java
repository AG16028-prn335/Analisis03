
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
    
     public  String[] RegExp(String cad) {
        String s = "", ca[] = cad.split("\\s");
        s = ca[0];
        char q = ca[0].charAt(s.length() - 1);
        int z=0;
        String w[]= new String[1+Integer.parseInt(""+q)];
        for (int i = 0; i < w.length ;  i++) {
            if(z<ca.length){
                      s = ca[z];
                if (s.charAt(s.length() - 1) == q ) {
                if (i == 0) {
                    w[i] =Coefi(s) ;
                } else {
                    w[i] =Coefi(s);
                }
                q--;
                z++;
            } else if( Integer.parseInt(""+q)<2){
                if (String.valueOf(s.charAt(s.length() - 1)).equals("x")) {
                w[i] = Coefi(s);
                } else if (s.charAt(s.length() - 1) > 0) {
                w[i] = ca[z];
                }
                z++;
            }else{
                w[i] = "0";
                q--;
            }
            }
        }
        return w;
    }
    
    public  String Coefi(String s){
        String z="";
        String pr=String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (!pr.equals("x")) {
                pr=String.valueOf(s.charAt(i));
            z+=String.valueOf(s.charAt(i));
            }
        }
        return z;
    }
    public String[] Nox(String s[]){
        int i=0;
        String ca;
        String x[];
        while(i<s.length){
        ca=s[i];
        x=ca.split("x");
        ca="";
        for (String x1 : x) {
            ca += x1;
        }
        s[i]=ca;
        i++;
        }
        return s;
    }
}
