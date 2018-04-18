package Metodos;

public class Tartaglia {

    public double tartaglia(String vector[]) {
        double a = 0, b = 0, c = 0, d, h, g, x1 = 0, teta, p, q;
        Object x2, x3, irre;
        if (Integer.parseInt(vector[0]) != 1) {
            a = Integer.parseInt(vector[1]) / Integer.parseInt(vector[0]);
            b = Integer.parseInt(vector[2]) / Integer.parseInt(vector[0]);
            c = Integer.parseInt(vector[3]) / Integer.parseInt(vector[0]);
        }
        h = (3 * b - Math.pow(a, 2)) / 9;
        g = (-9 * a * b + 27 * c + 2 * Math.pow(a, 3)) / 54;
        d = Math.pow(g, 2) + Math.pow(h, 3);

        if (d < 0) {
            teta = Math.acos(-g / Math.sqrt(-Math.pow(h, 3)));
            x1 = 2 * Math.sqrt(-h) * Math.cos(teta / 3) - a / 3;
            x2 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 120) - a / 3;
            x3 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 240) - a / 3;
        } else if (d == 0) {
            p = 3 * h;
            q = 2 * g;
            x1 = -((3 * q) / (2 * p)) - a / 3;
            x2 = ((-4 * Math.pow(p, 2)) / (9 * p)) - a / 3;
        } else {
            p = Math.cbrt((-g + Math.sqrt(d)));
            System.out.println("p :" + p);
            q = Math.cbrt((-g - Math.sqrt(d)));
            System.out.println("q :" + q);
            x1 = p + q - a / 3;
            System.out.println("x1: " + x1);
            irre = ((p - q) * Math.sqrt(3) / 2) + " i";
            System.out.println("irreal :" + irre);
            x2 = (-((p + q) / 2) - a / 3) + "-" + irre;
            System.out.println("x2: " + x2);
            x3 = (-((p + q) / 2) - a / 3) + "+" + irre;
            System.out.println("x3: " + x3);
        }
        return (x1);
    }
}
