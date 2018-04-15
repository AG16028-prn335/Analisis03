
package Metodos;

public class Secante {
    public double secante() {
        int cifS = 3, i = 0;
        double x0 = 0, x1 = 1, f0 = 0, f1 = 0, xi = 0, error = 100;
        double nivTolerancia = 0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        System.out.println("Error aprox: " + nivTolerancia);
        f0 = Math.exp(-x0) - x0;
        System.out.println("f(xi-1): " + f0);
        f1 = Math.exp(-x1) - x1;
        if (f0 < 0 && f1 > 0) {
            while (Math.abs(error) > nivTolerancia) {
                f0 = Math.exp(-x0) - x0;
                System.out.println("f(xi-1): " + f0);
                f1 = Math.exp(-x1) - x1;
                System.out.println("f(xi): " + f1);
                System.out.println("iteracion: " + i);
                xi = x1 - (f1 * (x0 - x1) / (f0 - f1));
                System.out.println("xi+1: " + xi);
                if(i!=0){
                error = ((xi - x1) / xi )* 100;
                System.out.println("error aprox: " + error);
                }
                x0 = x1;
                System.out.println("xi-1: " + x0);
                x1 = xi;
                System.out.println("xi: " + x1);
                i++;
            }
        } else {
            System.out.println("entro al else");
           while (Math.abs(error) > nivTolerancia) {
                f0 = -(Math.exp(-x0) - x0);
                System.out.println("f(xi-1): " + f0);
                f1 = -(Math.exp(-x1) - x1);
                System.out.println("f(xi): " + f1);
                System.out.println("iteracion: " + (i + 1));
                xi = x1 - (f1 * (x0 - x1) / (f0 - f1));
                System.out.println("xi+1: " + xi);
                if(i!=0){
                error = ((xi - x1) / xi )* 100;
                System.out.println("error aprox: " + error);
                }
                x0 = x1;
                System.out.println("xi-1: " + x0);
                x1 = xi;
                System.out.println("xi: " + x1);
                i++;
           }
        }
        return xi;
    }

}
