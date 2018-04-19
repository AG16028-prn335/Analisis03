package Metodos;

import javax.swing.table.DefaultTableModel;

public class MetodoHorner {

    MetodosGenerales m = new MetodosGenerales();
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"iteracion", "Xi", "X(i+1)", "Ea%"}, 0);

    @SuppressWarnings("empty-statement")
    public DefaultTableModel Horner(String cad, double limInf, double limSup) {
        double xi, ea = 100, es, r, s, xii = 0; int i=0;
        String coe[], coes[];
        es = (0.5 * Math.pow(10, -1));
        if (((m.Ecuacion(cad, limInf)) * (m.Ecuacion(cad, limSup))) < 0) {
            xi = -1.8;
            coe = m.RegExp(cad);
            coe = m.Nox(coe);
            for (String coe1 : coe) {
                System.out.println(coe1);
            }
            while (Math.abs(ea) > es) {
                
                coes = m.DivSintetica(xi, coe.length, coe);
                r = Double.parseDouble(coes[0]);
                s = Double.parseDouble(coes[1]);
                xii = xi - (r / s);
                ea = ((xii - xi) / xii) * 100;
                i++;
               String va[]={""+i,""+xi,""+xii,""+ea};
                modelo.addRow(va);
                xi = xii;
            }
        }
        return modelo;
    }
}
