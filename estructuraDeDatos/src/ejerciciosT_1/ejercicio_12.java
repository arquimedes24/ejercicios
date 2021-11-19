
package ejerciciosT_1;

import java.util.Scanner;

public class ejercicio_12 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println(" Digite el numero");
        double Num=leer.nextInt();
        double porcentaje=(Num*5)/100;
        System.out.println(" El numero es " + Num + ", y el 5% de ese valor es " + porcentaje);
    }
    
}
