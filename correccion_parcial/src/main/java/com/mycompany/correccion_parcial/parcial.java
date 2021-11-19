package com.mycompany.correccion_parcial;

import java.util.Scanner;

public class parcial {
    public static void  main (String[] args){
    Scanner entrada = new Scanner(System.in);
       
        int variable1 = (int) (Math.random()*69+1);
        System.out.println("El primer numero a lazar es:"+ variable1);
        
        int variable2 = (int) (Math.random()*69+1);
        System.out.println("El seguendo numero a lazar es:"+variable2);
        
        if (variable1 > variable2){
            System.out.println("el numero 1 es mayor al numero 2");  
        }
        else {
            System.out.println("el numero 2 es mayor que el 1");
        }
        int suma=variable1+variable2;
        System.out.println("la suma de los numeros es "+ suma);
        double division=variable1/variable2;
        System.out.println("la divison de los dos numeros es " + division);
        int modulo =variable1%variable2;
        System.out.println("el modulo de la division es "+  modulo);
                
    }
    
}
