
package ejerciciosT_1;

import java.util.Scanner;

public class ejercicio_11 {

       public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
        System.out.println(" Digite nombre");
        String Nombre=leer.next();
        System.out.println(" Digite el salario por hora");
        int Salariohora=leer.nextInt();
        System.out.println(" Digite el numero de horas que trabajó en el mes");
        double horasalmes=leer.nextInt();
        double salariomensual=Salariohora*horasalmes;
        System.out.println(" El nombre es " + Nombre + " y su salario mensual es " + salariomensual);
       }
    
}
