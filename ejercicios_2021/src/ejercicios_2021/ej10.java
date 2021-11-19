/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2021;

import java.util.Scanner;

 class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero1");
        int Number1=leer.nextInt();
        System.out.println("Digite numero2");
        int Number2=leer.nextInt();
        System.out.println("los numeros son " + Number1 + " y " + Number2);
        int Suma=Number1+Number2;
        if (Suma<0) {
            System.out.println("La suma es " + Suma);
        }
    }
    
}
