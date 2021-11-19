/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2021;

import java.util.Scanner;

public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int Number1, Number2;
        System.out.println("Ingrese los numeros");
        Number1 = Leer.nextInt();
        Number2 = Leer.nextInt();
        if (Number1 > 0 && Number2 > 0) {
            System.out.println(Number1 + " y " + Number2 + " Son positivos ");

        }

    }
}
