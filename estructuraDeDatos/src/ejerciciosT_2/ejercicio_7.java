
package ejerciciosT_2;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
        System.out.println(" Digite los litros por dia");
        double litros= leer.nextDouble();
        System.out.println(" Digite el precio del litro de leche");
        double precio=leer.nextDouble();
        double galones=litros/3.785;
        double preciototal=Math.round(precio*galones);
        System.out.println(" El precio a pagar por " + litros + " litros es de " + preciototal);
    }
    
}
