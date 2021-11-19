
package ejercicosfor;

import java.util.Scanner;


public class ejercicio_1 {
     public static void  main (String[] args){
    Scanner Leer = new Scanner(System.in);
        int numero= 8;
        int factorial = 1;
        for (int i=6;i>0;i--,numero--){
            factorial=factorial*numero;
        }
        System.out.println("El factorial es "+factorial );
    }
}
    

