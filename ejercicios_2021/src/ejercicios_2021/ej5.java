/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2021;

import java.util.Scanner;

public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        System.out.println(" Digite el numero");
        int number = leer.nextInt();
        if (number<0) {
            int valor=number*(-1);
            System.out.println("el valor absoluto de " + number + " es: " + valor);
        }else if(number==0){
            System.out.println("cero no tiene valor absoluto");
        }else{
            System.out.println("el valor absoluto es " + number);
        }
    
    }
    
}
