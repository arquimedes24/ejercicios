
package ejerciciosT_1;

import java.util.Scanner;

public class ejercicio_6 {

    public static void main(String[] args) {
   
     Scanner Leer = new Scanner (System.in);
        int Num1, Num2;
        System.out.println("Ingrese los numeros");
        Num1=Leer.nextInt();
        Num2=Leer.nextInt();
        System.out.println("el(los) positivo(s) es(son): ");
        if (Num1>0) {
            System.out.println(Num1);
        }
        if(Num2>0){
            System.out.println(Num2);
        }
        if (Num1<=0 && Num2<=0) {
            System.out.println(" No hay positivos");
            
        }
            }
    
}
