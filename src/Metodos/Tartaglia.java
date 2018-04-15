package Metodos;
public class Tartaglia {
     public double tartaglia() {
        double x = 4, a = -8, b = -11, c = -3, d, h, g, x1 = 0, x2 = 0, x3 = 0, teta,p,q,irre=0;

        if (x != 1) {
            a = a / x;
            System.out.println("a: " + a);
            b = b / x;
            System.out.println("b: " + b);
            c = c / x;
            System.out.println("c: " + c);
            x = x / x;
        }
        h = (3 * b - Math.pow(a, 2)) / 9;
        System.out.println("H: " + h);
        g = (-9 * a * b + 27 * c + 2 * Math.pow(a, 3)) / 54;
        System.out.println("g: " + g);
        d = Math.pow(g, 2) + Math.pow(h, 3);
        System.out.println("D: " + d);

        if (d < 0) {
            teta = Math.acos(-g / Math.sqrt(-Math.pow(h, 3)));
            System.out.println("teta: " + teta);
            x1 = 2 * Math.sqrt(-h) * Math.cos(teta / 3) - a / 3;
            System.out.println("x1: " + x1);
            x2 = 2 * Math.sqrt(-h) * Math.cos(teta / 3 + 120) - a / 3;
            System.out.println("x2: " + x2);
            x3=2 * Math.sqrt(-h) * Math.cos(teta / 3 + 240) - a / 3;
            System.out.println("x3: " + x3);
        }
        else if(d==0){
            p=3*h;
            System.out.println("p: " +p);
            q=2*g;
            System.out.println("q: " + q);
            x1=-((3*q)/(2*p))-a/3;
            System.out.println("x1: " + x1);
            x2=((-4*Math.pow(p, 2))/(9*p)) -a/3;
            System.out.println("x2: " + x2);
        }
        else{
        p=Math.cbrt((-g+Math.sqrt(d)));
        q=Math.cbrt((-g-Math.sqrt(d)));
        x1=p*q-a/3;
        System.out.println("x1: " + x1);
        irre=(p-q)*Math.sqrt(3)/2;
        x2=(-p+q)/2-a/3;
        System.out.println("x2: " + x2+"-"+irre+"i");
        x3=x2;
        System.out.println("x2: " + x3+"+"+irre+"i");
        }
return (x1);
    } 
}
