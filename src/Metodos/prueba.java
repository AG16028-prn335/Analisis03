package Metodos;

public class prueba {

    public static void main(String[] args) {
        double r = -2, s = -2, As = 0, Ar = 0, Ear = 100, Eas = 100;
        double a[] = new double[4];
        double b1[] = new double[4];
        double c[] = new double[4];
        double nivTolerancia = (0.5 * Math.pow(10, (-1)));
        a[3] = 1;
        a[2] = 5;
        a[1] = 7;
        a[0] = 3;
        b1[3] = a[3];
        //encontrando b y c
        int j = 0;
        do {
            System.out.println("b3: " + b1[3]);
            b1[2] = a[2] + r * b1[3];
            System.out.println("b2: " + b1[2]);
            for (int i = 1; i >= 0; i--) {
                System.out.println("calculando b");
                b1[i] = a[i] + r * b1[i + 1] + s * b1[i + 2];
                System.out.println("b" + i + ": " + b1[i]);
            }
            c[3] = b1[3];
            System.out.println("c3: " + c[3]);
            c[2] = b1[2] + r * c[3];
            System.out.println("c4:" + c[2]);
            for (int i = 1; i > 0; i--) {
                System.out.println("calculando c");
                c[i] = b1[i] + r * c[i + 1] + s * c[i + 2];
                System.out.println("c" + i + ": " + c[i]);
            }
            //resolviendo el metodo de reduccion
            As = (c[1] * (-b1[0]) - c[2] * (-b1[1])) / (c[3] * c[1] - c[2] * c[2]);
            System.out.println("As: " + As);
            Ar = (-b1[0] - c[3] * As) / c[2];
            System.out.println("Ar:" + Ar);

            //encontrando r, s
            r = r + Ar;
            System.out.println("r: " + r);
            s = s + As;
            System.out.println("s: " + s);

            //calculando Ear y Eas
            Ear = Math.abs(Ar / r) * 100;
            System.out.println("Ear: " + Ear);
            Eas = Math.abs(As / s) * 100;
            System.out.println("Eas: " + Eas);
            System.out.println("------------------iteracion:"+(j+1));
            j++;
        }while (Math.abs(Ear) > nivTolerancia && Math.abs(Eas) > nivTolerancia);
    }

}
