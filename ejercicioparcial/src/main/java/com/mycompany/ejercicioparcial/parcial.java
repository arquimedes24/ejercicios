
package com.mycompany.ejercicioparcial;

import java.util.Scanner;

public class parcial {
    public static void  main (String[] args){
     Scanner par = new Scanner(System.in);
        
     System.out.println("Digite el valor de j");
        double j;
        j= par.nextInt();
     
     System.out.println("Digite el valor de c");
        double c;
        c= par.nextInt();   
        if (c%2==0){
            System.out.println(" El numero es par ");
        }else
            System.out.println(" El numero es impar ");
     
        System.out.println("Digite el valor de l");
        double l;
        l= par.nextInt();
        
        int numero1 = (int) (Math.random()*99+1);
        System.out.println("este es el numero a lazar:"+ numero1);
        if ( numero1 > 50){
            System.out.println("El numero es mayor a 50");
        }
        
         else{
            System.out.println("El numero es menor a 50");//
            
            }
             double total1=numero1+j+c+l;
             System.out.println(" La suma de los dos numeros es "+ total1);
    }    
}
