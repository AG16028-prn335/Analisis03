package Metodos;
public class bairstow {
    
    public double bairstow(String fun, double r, double s, String vector[]) {
        int numb = vector.length;
        double Ar=0, As=0;
        Object b[], c[];
        b = new Object [numb];
        c = new Object [numb];
        double nivTolerancia = (0.5 * Math.pow(10, (2 -3)));
        //paso 2
        //encontrando b
        b[0]=Double.parseDouble(vector[0]);
        b[1]=Double.parseDouble(vector[1])+(r*Double.parseDouble(String.valueOf(b[0])));
        for (int i = (numb-3); i >=0; i--) {
          b[i]=Double.parseDouble(vector[i])+r*Double.parseDouble(String.valueOf(b[i-1]))+s*Double.parseDouble(String.valueOf(b[numb]));
          numb--; 
        }
        //encontrando c
        c[0]=b[0];
        c[1]=Double.parseDouble(String.valueOf(b[1]))+(r*Double.parseDouble(String.valueOf(b[0])));
        for (int i = (numb-3); i >=0; i--) {
          c[i]=Double.parseDouble(String.valueOf(b[i]))+r*Double.parseDouble(String.valueOf(c[i-1]))+s*Double.parseDouble(String.valueOf(c[numb]));
          numb--; 
        }
        //metodo de reduccion
       As= ((Double.parseDouble(String.valueOf(c[0])))*(-Double.parseDouble(String.valueOf(b[numb])))-(Double.parseDouble(String.valueOf(c[1])))*(Double.parseDouble(String.valueOf(b[numb]))));
       As=As/(Double.parseDouble(String.valueOf(c[2]))*Double.parseDouble(String.valueOf(c[0]))-(Double.parseDouble(String.valueOf(c[1])))*Double.parseDouble(String.valueOf(c[1])));
       Ar=((-Double.parseDouble(String.valueOf(b[numb])))-(Double.parseDouble(String.valueOf(c[2])))*As)/Double.parseDouble(String.valueOf(c[1]));
       
        
        
        return 0;
    }
}
