/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2021;

import java.util.Scanner;


public class ej9 {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        int Number1=leer.nextInt();
        int Number2=leer.nextInt();
        int suma=Number1+Number2;
        System.out.println("Los numeros son: " + Number1 + " y " + Number2 + 
                " y la suma de estos es " + suma);
    }
    
}
