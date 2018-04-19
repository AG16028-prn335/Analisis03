package Metodos;

import org.nfunk.jep.type.Complex;

public class bairstow {
    MetodosGenerales m = new MetodosGenerales();
    public double bairstow(double r0, double s0, String vector[]) {
        String v[];
          Complex xii;
        double Ar, As,r=0,s=0,Ear=100,Eas=100,xi,xreal,xim;
        double Es=(0.5*Math.pow(10, -1));
        while(Eas>Es || Ear>Es){
            v=m.DivSint2(r0, s0, vector.length, vector,3);
        As=(-Double.parseDouble(v[1])*Double.parseDouble(v[2]))+(Double.parseDouble(v[3])*Double.parseDouble(v[0]));
        As=As/(((-Math.pow(Double.parseDouble(v[3]), 2)/Double.parseDouble(v[2]))+Double.parseDouble(v[4]))*Double.parseDouble(v[2]));
        Ar=-Double.parseDouble(v[0])-(Double.parseDouble(v[3])*As);
        Ar=Ar/Double.parseDouble(v[2]);
        r = r0 + Ar;
        s = s0 + As;
        Ear = Math.abs(Ar / r) * 100;
        Eas = Math.abs(As / s) * 100;
        r0=r;
        s0=s;
        }
        if(m.Discriminante(r, s, 0, 2)<0){
           xii=m.Comple(r, s);
           xreal=xii.re();
           xim=xii.im();
        }else if(m.Discriminante(r, s, 0, 2)==0){
            xi=r/2;
        }else{
        
        }
        
    return 0;    
    }
    public String[] DivComple(String raiz[],int n, String coefi[]){
        
        
       return raiz; 
    }
}
