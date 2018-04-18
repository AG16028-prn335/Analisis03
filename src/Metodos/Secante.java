package Metodos;

public class Secante {

    MetodosGenerales m = new MetodosGenerales();

    public String[] secante(String fun, double x0, double x1) {
        int  i = 0;
        double f0 = 0, f1 = 0, xi = 0, error = 100, nivTolerancia = 0;
        nivTolerancia = (0.5 * Math.pow(10, (2 -3)));
        f0 = m.Ecuacion(fun, x0);
        f1 = m.Ecuacion(fun, x1);
        if (f0 < 0 && f1 > 0) {
            while (Math.abs(error) > nivTolerancia) {
                f0 = m.Ecuacion(fun, x0);
                f1 = m.Ecuacion(fun, x1);
                xi = x1 - (f1 * (x0 - x1) / (f0 - f1));
                if (i != 0) {
                    error = ((xi - x1) / xi) * 100;
                }
                x0 = x1;
                x1 = xi;
                i++;
            }
        } else {
            fun="-("+fun+")";
            while (Math.abs(error) > nivTolerancia) {
                f0 = m.Ecuacion(fun, x0);
                f1 = m.Ecuacion(fun, x1);
                xi = x1 - (f1 * (x0 - x1) / (f0 - f1));
                if (i != 0) {
                    error = ((xi - x1) / xi) * 100;
                }
                x0 = x1;
                x1 = xi;
                i++;
            }
        }
        String s[]={String.valueOf(xi),String.valueOf(error)};
        return s;
    }

}
