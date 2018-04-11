package Metodos;
public class MetodoHorner {
    MetodosGenerales m = new MetodosGenerales();
    public double Horner(double limInf, double limSup){
        double xi,ea,es,r=1,s=1,xii;
        es=(0.5*Math.pow(10,-1));
        if(((m.Ecuacion("", limInf))*(m.Ecuacion("", limSup)))<0){
            xi=(limInf+limSup)/2;
            do {
                //este metodo no hace nada ...
                m.DivSinteticaR(xi);
                xii=xi-(r/s);
                ea=((xii-xi)/xii)*100;
                xi=xii;
            } while (ea>es);
            System.out.println("La raiz es: "+xii);
            System.out.println("con error de: "+Math.abs(ea)+"%");
        }
        return 0;
    }
}
