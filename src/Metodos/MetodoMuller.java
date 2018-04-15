package Metodos;
public class MetodoMuller {
    MetodosGenerales m = new MetodosGenerales();
    public double Muller(String cad,double x,double x1,double x2,int n){
        double h,h1,s,s1,a,b,c,x3=0,es,ea=100;
        int i=0;
        es=(0.5*Math.pow(10,2-n));
            
        while (Math.abs(ea)>es){
            i++;
            h=x1-x;
            h1=x2-x1;
            s=(m.Ecuacion(cad,x1)-m.Ecuacion(cad,x))/h;
            s1=(m.Ecuacion(cad,x2)-m.Ecuacion(cad,x1))/h1;
            a=(s1-s)/(h1+h);
            b=(a*h1)+s1;
            c=m.Ecuacion(cad,x2);
            if(b<0){
                x3=x2+(-2*c/(b-m.Discriminante(a, b, c)));
            }else{
                x3=x2+(-2*c/(b+m.Discriminante(a, b, c)));
            }
            ea=((x3-x2)/x3)*100;
            x=x1;x1=x2;x2=x3;
        }
        return x3;
    }
    
    
}
