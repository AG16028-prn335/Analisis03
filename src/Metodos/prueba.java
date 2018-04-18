package Metodos;

public class prueba {

    public static void main(String[] args) {
        double r = -1, s = -1, As = 0, Ar = 0, Ear = 100, Eas = 100, x1,x2;
        double a[] = new double[5];
        double b1[] = new double[5];
        double c[] = new double[5];
        double nivTolerancia = (0.5 * Math.pow(10, (-1)));
        a[4] = 1;
        a[3] = -1.1;
        a[2] = 2.3;
        a[1] = 0.5;
        a[0] = 3.3;
        int j=0;
        while (Eas>nivTolerancia || Ear>nivTolerancia){
            System.out.println("entro al bucle");
            //encontrando b y c
            b1[4] = a[4];
            System.out.println("b4: " + b1[4]);
            b1[3] = a[3] + r * b1[4];
            System.out.println("b3: " + b1[3]);
            for (int i = 2; i >= 0; i--) {
                System.out.println("calculando b");
                b1[i] = a[i] + r * b1[i + 1] + s * b1[i + 2];
                System.out.println("b" + i + ": " + b1[i]);
            }
            c[4] = b1[4];
            System.out.println("c3: " + c[4]);
            c[3] = b1[3] + r * c[4];
            System.out.println("c2:" + c[3]);
            for (int i = 2; i > 0; i--) {
                System.out.println("calculando c");
                c[i] = b1[i] + r * c[i + 1] + s * c[i + 2];
                System.out.println("c" + i + ": " + c[i]);
            }
            //resolviendo el metodo de reduccion
            As = (c[1] * (-b1[1]) - c[2] * (-b1[0])) / (c[3] * c[1] - c[2] * c[2]);
            System.out.println("As: " + As);
            Ar = (-b1[1] - c[3] * As) / c[2];
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
            System.out.println("------------------iteracion:" + (j + 1));
            System.out.println("saliendo del bucle");
            j++;
        }
        x1=(r+Math.sqrt(Math.pow(r, 2)+4*s))/2;
        x2=(r-Math.sqrt(Math.pow(r, 2)+4*s))/2;
        
    }

}
