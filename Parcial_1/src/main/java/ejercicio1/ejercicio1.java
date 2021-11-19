package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
     public static void  main (String[] args){
    Scanner Leer = new Scanner(System.in);
     System.out.println(" Digite el tipo del motor (valor 1 a 3) ");   
         int numero=Leer.nextInt();
         if (numero==0){
          System.out.println(" No hayun valor establecido para el tipo  ");  
     }
         else if  ( numero==1){
             System.out.println(" El tipo de fluido que puede transportar el motor 1 es Agua  "); 
         }
          else if  ( numero==2){
             System.out.println(" El tipo de fluido que puede transportar el motor 2 es Gasolina "); 
         }
            else if  ( numero==3){
             System.out.println(" El tipo de fluido que puede transportar el motor 3 es Hormigon "); 
         }      
            else {
             System.out.println(" No existe un valor valido ");
            
            }
        
    }
}
