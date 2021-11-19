package ejercicio1;

import java.util.Scanner;

public class ejercicio3 {
    public static void  main (String[] args){
    Scanner lector = new Scanner(System.in);
    
     int variable1 = (int) (Math.random()*49+1);
        System.out.println("El numero aleatorio es:"+ variable1);
        
        if (variable1%2==0){
            System.out.println(" El numero es par ");
        }else
            System.out.println(" El numero es impar ");
       
        
    }
}
