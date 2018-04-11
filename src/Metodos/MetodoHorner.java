package Metodos;
public class MetodoHorner {
    public double Horner(double []v){
        double limInf=0,limSup=0,valor=0,xi,ea,es,r=1,s=1,xii;
        //en el if solo puse valor para que no me de error
        es=(0.5*Math.pow(10,-1));
        limInf=Math.abs(v[v.length-1])/(Math.abs(v[v.length-1])+v[0]);
        limSup=Math.abs(v[0])/(Math.abs(v[0])+v[0]);
        if(valor<0){
            xi=(limInf+limSup)/2;
            do {
                //este metodo no hace nada ...
                MetodosGenerales.DivSinteticaR(xi);
                xii=xi-(r/s);
                ea=((xii-xi)/xii)*100;
                xi=xii;
            } while (ea>es);
            System.out.println("La raiz es: "+xii);
            System.out.println("con error de: "+Math.abs(ea)+"%");
        }
        return valor;
    }
}
