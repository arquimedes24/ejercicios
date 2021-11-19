
package ejerciciosT_1;

import java.util.Scanner;
public class ejercicio_9 {

    public static void main(String[] args) {
      
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        int Num1=leer.nextInt();
        int Num2=leer.nextInt();
        int suma=Num1+Num2;
        System.out.println("Los numeros son: " + Num1 + " y " + Num2 + " y la suma de estos es " + suma);
        }
    
}
