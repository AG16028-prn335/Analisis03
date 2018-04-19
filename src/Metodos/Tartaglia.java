package Metodos;

import javax.swing.DefaultListModel;

public class Tartaglia {

    MetodosGenerales m = new MetodosGenerales();
    DefaultListModel modelo1 = new DefaultListModel();

    public DefaultListModel tartaglia(String vector[]) {
        double a = 0, b = 0, c = 0, d, h, g, x1 = 0, teta, p, q;
        Object x2, x3, irre;
        if (Integer.parseInt(vector[0]) != 1) {
            a = Integer.parseInt(vector[1]) / Integer.parseInt(vector[0]);
            b = Integer.parseInt(vector[2]) / Integer.parseInt(vector[0]);
            c = Integer.parseInt(vector[3]) / Integer.parseInt(vector[0]);
        } else {
            a = Integer.parseInt(vector[1]);
            b = Integer.parseInt(vector[2]);
            c = Integer.parseInt(vector[3]);
        }
        h = (3 * b - Math.pow(a, 2)) / 9;
        g = (-9 * a * b + 27 * c + 2 * Math.pow(a, 3)) / 54;
        d = Math.pow(g, 2) + Math.pow(h, 3);

        if (d < 0) {
            teta = Math.acos(-g / Math.sqrt(-Math.pow(h, 3)));
            x1 = 2 * Math.sqrt(-h) * Math.cos(teta / 3) - a / 3;
            x2 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 120) - a / 3;
            x3 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 240) - a / 3;
            modelo1.addElement(x1);
            modelo1.addElement(x2);
            modelo1.addElement(x3);
        } else if (d == 0) {
            p = 3 * h;
            q = 2 * g;
            x1 = -((3 * q) / (2 * p)) - a / 3;
            x2 = ((-4 * Math.pow(p, 2)) / (9 * p)) - a / 3;
            modelo1.addElement(x1);
            modelo1.addElement(x2);
        } else {
            p = Math.cbrt((-g + Math.sqrt(d)));
            q = Math.cbrt((-g - Math.sqrt(d)));
            x1 = p + q - a / 3;
            irre = ((p - q) * Math.sqrt(3) / 2) + " i";
            x2 = (-((p + q) / 2) - a / 3) + "-" + irre;
            x3 = (-((p + q) / 2) - a / 3) + "+" + irre;
            modelo1.addElement(x1);
            modelo1.addElement(x2);
            modelo1.addElement(x3);
        }

        return modelo1;
    }
}
