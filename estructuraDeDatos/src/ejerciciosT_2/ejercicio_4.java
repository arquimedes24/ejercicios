
package ejerciciosT_2;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
        System.out.println(" Digite el valor del radio");
        double Radio=leer.nextDouble();
        final double pi = 3.1416;
        double area =pi*(Math.pow(Radio, 2));
        System.out.println(" El area de la circunferencia es " + area);

    }
    
}
