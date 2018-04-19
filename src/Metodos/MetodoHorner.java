package Metodos;
public class MetodoHorner {
    MetodosGenerales m = new MetodosGenerales();
    public double Horner(String cad,double limInf, double limSup){
        double xi,ea=100,es,r,s,xii=0;
        String coe[],coes[];
        es=(0.5*Math.pow(10,-1));
        System.out.println(es);
        if(((m.Ecuacion(cad, limInf))*(m.Ecuacion(cad, limSup)))<0){
            xi=-1.8;
            coe=m.RegExp(cad);
            coe=m.Nox(coe);
            for (String coe1 : coe) {
                System.out.println(coe1);
            }
            while (Math.abs(ea)>es){
                //este metodo no hace nada ...
                coes=m.DivSintetica(xi,coe.length,coe);
                r=Double.parseDouble(coes[0]);
                s=Double.parseDouble(coes[1]);
                System.out.println("r: "+r+" s: "+s);
                xii=xi-(r/s);
                System.out.println("xii: "+xii);
                ea=((xii-xi)/xii)*100;
                xi=xii;
            }
            System.out.println("La raiz es: "+xii);
            System.out.println("con error de: "+Math.abs(ea)+"%");
        }
        return 0;
    }
}
