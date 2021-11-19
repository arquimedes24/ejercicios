/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2021;

import java.util.Scanner;


public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int Number1, Number2;
   Scanner Leer = new Scanner (System.in);
        System.out.println("Ingrese los numeros");
        Number1=Leer.nextInt();
        Number2=Leer.nextInt();
        System.out.println("el(los) positivo(s) es(son): ");
        if (Number1>0) {
            System.out.println(Number1);
        }
        if(Number2>0){
            System.out.println(Number2);
        }
        if (Number1<=0 && Number2<=0) {
            System.out.println(" No hay positivos");
            
        }
    }
    
}
