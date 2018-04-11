package Metodos;
public class MetodoMuller {
    public double Muller(int n,double x,double x1,double x2){
        double h,h1,s,s1,a,b,c,x3,es,ea;
        es=(0.5*Math.pow(10,-1));
        
        do {
            h=x1-x;
            h1=x2-x1;
            s=(Funcion(x1,n)-Funcion(x,n))/h;
            s1=(Funcion(x2,n)-Funcion(x1,n))/h1;
            a=(s1-s)/(h1+h);
            b=(a*h1)+s1;
            c=Funcion(x2,n);
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
    
    double Funcion(double x,int p){
        double respuesta;
       switch(p){
           case 1:
               respuesta=Math.pow(x,3)+(3*x)-1;
               break;
           case 2:
               respuesta=Math.pow(x,3)-(4.65*Math.pow(x,2))-(49.92*x)-76.69;
               break;
           case 3:
               respuesta=Math.pow(x,4)+Math.pow(x,3)-(0.56*Math.pow(x,2))-(1.44*x)-2.88;
               break;
           case 4:
               respuesta=Math.pow(x,4)-(3*Math.pow(x,2))+(5*x)+2;
               break;
           case 5:
               respuesta=Math.pow(x,5)-(3*Math.pow(x,4))-(23*Math.pow(x,3))+(55*Math.pow(x,2))+(74*x)-120;
               break;
           case 6:
               respuesta=Math.pow(x,6)-(7*Math.pow(x,4))+Math.pow(x,3)+(3*x)-1;
               break;
           case 7:
               respuesta=Math.log(1+x)-Math.cos(Math.toRadians(x));
               break;
           case 8:
               respuesta=(10*Math.sin(Math.toRadians(x)))+(3*Math.cos(Math.toRadians(x)));
               break;
           case 9:
               respuesta=Math.exp((3*(x-1))) -(2*Math.log(x-1))+1;
               break;
           default:
               respuesta=0;
               break;
       }
        return respuesta;
    }
}
