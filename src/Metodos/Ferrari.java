package Metodos;
public class Ferrari {
public Ferrari() {
        double x=1, a=-8, b=14, c=4, d1=-8, p=0,q=0,r=0;
        
        p=(8*b-3*Math.pow(a, 2))/8;
        System.out.println("p: "+p);
        q=(8*c-4*a*b+Math.pow(a, 3))/8;
        System.out.println("q: "+q);
        r=(256*d1-64*a*c+16*Math.pow(a, 2)*b-3*Math.pow(a, 4))/256;
        System.out.println("r: "+r);
        //empieza tartaglia
        double u, au, bu, cu,h,g,d, teta,x1,x2,x3,x4,v,w; 
        au=-p/2;
        bu=-r;
        cu=(4*p*r-q)/8;
        h = (3 * b - Math.pow(a, 2)) / 9;
        System.out.println("H: " + h);
        g = (-9 * a * b + 27 * c + 2 * Math.pow(a, 3)) / 54;
        System.out.println("g: " + g);
        d = Math.pow(g, 2) + Math.pow(h, 3);
        System.out.println("D: " + d);
//det raíz por tataglia
        if (d < 0) {
            teta = Math.acos(-g / Math.sqrt(-Math.pow(h, 3)));
            System.out.println("teta: " + teta);
            x1 = 2 * Math.sqrt(-h) * Math.cos(teta / 3) - a / 3;
            System.out.println("x1: " + x1);
        }
        else if(d==0){
            p=3*h;
            System.out.println("p: " +p);
            q=2*g;
            System.out.println("q: " + q);
            x1=-((3*q)/(2*p))-a/3;
            System.out.println("x1: " + x1);
        }
        else{
        p=Math.cbrt((-g+Math.sqrt(d)));
        q=Math.cbrt((-g-Math.sqrt(d)));
        x1=p*q-a/3;
        System.out.println("x1: " + x1);
        }
        u=x1;
        v=Math.sqrt(2*u-p);
        w=Math.sqrt(Math.pow(u, 2)-r);
        
        //por ferrari
        
        x1=(v+Math.sqrt((Math.pow(v, 2)-4*(u-w))))/2 -a/4;
        System.out.println("x1: " + x1);
        x2=(v-Math.sqrt((Math.pow(v, 2)-4*(u-w))))/2 -a/4;
        System.out.println("x2: " + x2);
        x3=(-v+Math.sqrt((Math.pow(v, 2)-4*(u-w))))/2 -a/4;
        System.out.println("x3: " + x3);
        x4=(-v-Math.sqrt((Math.pow(v, 2)-4*(u-w))))/2 -a/4;
        System.out.println("x4: " + x4);
    }    
}
