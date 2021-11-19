
package ejerciciosT_2;

import java.util.Scanner;

public class ejercicio_8 {

    public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
        System.out.println(" Digite X1");
        int X1=leer.nextInt();
        System.out.println(" Digite X2");
        int X2=leer.nextInt();
        System.out.println(" Digite Y1");
        int Y1=leer.nextInt();
        System.out.println(" Digite Y2");
        int Y2=leer.nextInt();
        double distancia=Math.pow(Math.pow((X2-X1), 2)+Math.pow((Y2-Y1), 2), 0.5);
        System.out.println(" La distancia entre los puntos es " + distancia);
    }
    
}
