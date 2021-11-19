
package ejerciciosT_1;

import java.util.Scanner;

public class ejercicio_10 {

 
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero1");
        int Num1=leer.nextInt();
        System.out.println("Digite numero2");
        int Num2=leer.nextInt();
        System.out.println("los numeros son " + Num1 + " y " + Num2);
        int Suma=Num1+Num2;
        if (Suma<0) {
            System.out.println("La suma es " + Suma);
        }}
    
}
