package Metodos;
public class MetodoMuller {
    MetodosGenerales m = new MetodosGenerales();
    public double Muller(String cad,double x,double x1,double x2){
        double h,h1,s,s1,a,b,c,x3,es,ea;
        es=(0.5*Math.pow(10,-1));
        do {
            h=x1-x;
            h1=x2-x1;
            s=(m.Ecuacion(cad,x1)-m.Ecuacion(cad,x))/h;
            s1=(m.Ecuacion(cad,x2)-m.Ecuacion(cad,x1))/h1;
            a=(s1-s)/(h1+h);
            b=(a*h1)+s1;
            c=m.Ecuacion(cad,x2);
            if(b<0){
                x3=x2+(2*c/(b-Math.pow((Math.pow(b,2))-4*a*c, 0.5)));
            }else{
                x3=x2+(2*c/(b+Math.pow((Math.pow(b,2))-4*a*c, 0.5)));
            }
            ea=((x3-x2)/x3)*100;
            x=x1;x1=x2;x2=x3;
        } while (Math.abs(ea)>es);
        return x3;
    }
    
    
}
