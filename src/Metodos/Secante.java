package Metodos;

import javax.swing.table.DefaultTableModel;

public class Secante {

    MetodosGenerales m = new MetodosGenerales();
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"iteracion","X(i-1)","Xi","X(i+1)", "Ea%"},0);
    public DefaultTableModel secante(String fun, double x0, double x1) {
        int  i = 0;
        double f0 = 0, f1 = 0, xi = 0, error = 100, nivTolerancia = 0;
        nivTolerancia = (0.5 * Math.pow(10, (-1)));
        f0 = m.Ecuacion(fun, x0);
        f1 = m.Ecuacion(fun, x1);
        
        if (f0 < 0 && f1 > 0) {
            while (Math.abs(error) > nivTolerancia) {
                modelo.setRowCount(i);
                modelo.setColumnCount(5);
                f0 = m.Ecuacion(fun, x0);
                f1 = m.Ecuacion(fun, x1);
                xi = x1 - (f1 * (x0 - x1) / (f0 - f1));
                if (i != 0) {
                    error = ((xi - x1) / xi) * 100;
                }
                x0 = x1;
                x1 = xi;
                i++;
                modelo.addRow(new Object []{i,x0, x1,xi,error});
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
                modelo.addRow(new Object []{i,x0, x1,xi,error});
            }
        }
        //String s[]={String.valueOf(xi),String.valueOf(error)};
        return modelo;
    }

}
