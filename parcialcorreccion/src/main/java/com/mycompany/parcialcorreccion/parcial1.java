
package com.mycompany.parcialcorreccion;

import java.util.Scanner;

public class parcial1 {
    public static void  main (String[] args){
         Scanner Leer = new Scanner(System.in);
         System.out.println("Digite el valor de A");
        double A;
        A= Leer.nextInt();
        int num1 = (int) (Math.random()*99+1);
        System.out.println("este es el numero a lazar:"+ num1);
        double resta= A-num1;
        System.out.println("la resta de los dos numeros es:"+ resta);
         if ( A > num1){
            System.out.println("el numero 1 es mayor al numero 2");  
        }
        else {
            System.out.println("el numero 2 es mayor que el 1");
        
         }
         
    }
}

