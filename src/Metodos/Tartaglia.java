package Metodos;

import javax.swing.table.DefaultTableModel;

public class Tartaglia {

    MetodosGenerales m = new MetodosGenerales();
    DefaultTableModel modelo1 = new DefaultTableModel(new Object[]{"raiz"},0);

    public DefaultTableModel tartaglia(String vector[]) {
        double a = 0, b = 0, c = 0, d, h, g, teta, p, q;
        Object x1,x2, x3, irre;
        if (Integer.parseInt(vector[0]) != 1) {
            a = Double.parseDouble(vector[1]) / Double.parseDouble(vector[0]);
            b = Double.parseDouble(vector[2]) / Double.parseDouble(vector[0]);
            c = Double.parseDouble(vector[3]) / Double.parseDouble(vector[0]);
        } else {
            a = Double.parseDouble(vector[1]);
            b = Double.parseDouble(vector[2]);
            c = Double.parseDouble(vector[3]);
        }
        h = (3 * b - Math.pow(a, 2)) / 9;
        g = (-9 * a * b + 27 * c + 2 * Math.pow(a, 3)) / 54;
        d = Math.pow(g, 2) + Math.pow(h, 3);

        if (d < 0) {
            teta = Math.acos(-g / Math.sqrt(-Math.pow(h, 3)));
            x1 = 2 * Math.sqrt(-h) * Math.cos(teta / 3) - a / 3;
            x2 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 120) - a / 3;
            x3 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 240) - a / 3;
            modelo1.addRow(new Object []{x1});
            modelo1.addRow(new Object []{x2});
            modelo1.addRow(new Object []{x3});
        } else if (d == 0) {
            p = 3 * h;
            q = 2 * g;
            x1 = -((3 * q) / (2 * p)) - a / 3;
            x2 = ((-4 * Math.pow(p, 2)) / (9 * p)) - a / 3;
            modelo1.addRow(new Object []{x1});
            modelo1.addRow(new Object []{x2});
        } else {
            p = Math.cbrt((-g + Math.sqrt(d)));
            q = Math.cbrt((-g - Math.sqrt(d)));
            x1 = p + q - a / 3;
            irre = ((p - q) * Math.sqrt(3) / 2) + " i";
            x2 = (-((p + q) / 2) - a / 3) + "-" + irre;
            x3 = (-((p + q) / 2) - a / 3) + "+" + irre;
            modelo1.addRow(new Object []{x1});
            modelo1.addRow(new Object []{x2});
            modelo1.addRow(new Object []{x3});
        }

        return modelo1;
    }
}
