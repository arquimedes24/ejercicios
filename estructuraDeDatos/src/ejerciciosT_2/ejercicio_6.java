
package ejerciciosT_2;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
        System.out.println(" Digite el valor de H");
        double H = leer.nextDouble();
        System.out.println(" Digite el valor de R");
        double R = leer.nextDouble();
        double valorcateto=Math.pow(Math.pow(H,2)-Math.pow(R, 2),0.5);
        double areatriangulo=(valorcateto*R)/2;
        double areatotaltriangulo=areatriangulo*2;
        final double pi=3.1416;
        double areasemicirculo=(pi*Math.pow(R, 2))/2;
        double areatotalfigura=areatotaltriangulo+areasemicirculo;
        System.out.println(" El area total de la figura es " + areatotalfigura);
        
    }
    
}
