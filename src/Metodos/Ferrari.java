package Metodos;

import javax.swing.table.DefaultTableModel;

public class Ferrari {

    MetodosGenerales m = new MetodosGenerales();
    DefaultTableModel modelo1 = new DefaultTableModel(new Object[]{"raiz"}, 0);

    public DefaultTableModel ferrari(String vector[]) {
        double a = 0, b = 0, c = 0, d1 = 0, p = 0, q = 0, r = 0;
        if (Integer.parseInt(vector[0]) != 1) {
            a = Integer.parseInt(vector[1]) / Integer.parseInt(vector[0]);
            b = Integer.parseInt(vector[2]) / Integer.parseInt(vector[0]);
            c = Integer.parseInt(vector[3]) / Integer.parseInt(vector[0]);
            d1 = Integer.parseInt(vector[4]) / Integer.parseInt(vector[0]);
        }
        p = (8 * b - 3 * Math.pow(a, 2)) / 8;
        q = (8 * c - 4 * a * b + Math.pow(a, 3)) / 8;
        r = (256 * d1 - 64 * a * c + 16 * Math.pow(a, 2) * b - 3 * Math.pow(a, 4)) / 256;
        //empieza tartaglia
        double u, au, bu, cu, h, g, d, teta, x1, x2, x3, x4, v, w;
        au = -p / 2;
        bu = -r;
        cu = (4 * p * r - q) / 8;
        h = (3 * b - Math.pow(a, 2)) / 9;
        g = (-9 * a * b + 27 * c + 2 * Math.pow(a, 3)) / 54;
        d = Math.pow(g, 2) + Math.pow(h, 3);
//det raíz por tataglia
        if (d < 0) {
            teta = Math.acos(-g / Math.sqrt(-Math.pow(h, 3)));
            x1 = 2 * Math.sqrt(-h) * Math.cos(teta / 3) - a / 3;
        } else if (d == 0) {
            p = 3 * h;
            q = 2 * g;
            x1 = -((3 * q) / (2 * p)) - a / 3;
        } else {
            p = Math.cbrt((-g + Math.sqrt(d)));
            q = Math.cbrt((-g - Math.sqrt(d)));
            x1 = p * q - a / 3;
        }
        u = x1;
        v = Math.sqrt(2 * u - p);
        w = Math.sqrt(Math.pow(u, 2) - r);

        //por ferrari
        x1 = (v + Math.sqrt((Math.pow(v, 2) - 4 * (u - w)))) / 2 - a / 4;
        x2 = (v - Math.sqrt((Math.pow(v, 2) - 4 * (u - w)))) / 2 - a / 4;
        System.out.println("x2: " + x2);
        x3 = (-v + Math.sqrt((Math.pow(v, 2) - 4 * (u - w)))) / 2 - a / 4;
        System.out.println("x3: " + x3);
        x4 = (-v - Math.sqrt((Math.pow(v, 2) - 4 * (u - w)))) / 2 - a / 4;
        System.out.println("x4: " + x4);
        modelo1.addRow(new Object[]{x1});
        modelo1.addRow(new Object[]{x2});
        modelo1.addRow(new Object[]{x3});
        modelo1.addRow(new Object[]{x4});
        return modelo1;
    }
}
