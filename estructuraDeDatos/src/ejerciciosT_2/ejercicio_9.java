
package ejerciciosT_2;

import java.util.Scanner;


public class ejercicio_9 {

    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println(" Ingrese las medidas en metros");
        double medida=leer.nextDouble();
        double pulgadas=Math.round(medida/0.0254);
    }
    
}
