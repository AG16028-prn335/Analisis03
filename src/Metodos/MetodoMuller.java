package Metodos;

import javax.swing.table.DefaultTableModel;

public class MetodoMuller {

    MetodosGenerales m = new MetodosGenerales();
    DefaultTableModel modelo1 = new DefaultTableModel(new Object[]{"iteracion","Xo","Xi","X2","x3", "Ea%"},0);

    public DefaultTableModel Muller(String cad, double x, double x1, double x2) {
        double h, h1, s, s1, a, b, c, x3 = 0, es, ea = 100;
        int i = 0;
        es = (0.5 * Math.pow(10, -1));

        while (Math.abs(ea) > es) {
            modelo1.setRowCount(i);
            modelo1.setColumnCount(6);
            h = x1 - x;
            h1 = x2 - x1;
            s = (m.Ecuacion(cad, x1) - m.Ecuacion(cad, x)) / h;
            s1 = (m.Ecuacion(cad, x2) - m.Ecuacion(cad, x1)) / h1;
            a = (s1 - s) / (h1 + h);
            b = (a * h1) + s1;
            c = m.Ecuacion(cad, x2);
            if (b < 0) {
                x3 = x2 + (-2 * c / (b - m.Discriminante(a, b, c, 1)));
            } else {
                x3 = x2 + (-2 * c / (b + m.Discriminante(a, b, c, 1)));
            }
            ea = ((x3 - x2) / x3) * 100;
            modelo1.addRow(new Object[]{(i+1), x, x1, x2, x3, ea});
            x = x1;
            x1 = x2;
            x2 = x3;
            i++;
        }
        return modelo1;
    }

}
