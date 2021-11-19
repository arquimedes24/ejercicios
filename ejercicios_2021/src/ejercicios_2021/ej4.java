/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2021;

import java.util.Scanner;

public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("nombre");
        String Nombre=leer.next();
        System.out.println("edad");
        int   Edad=leer.nextInt();
        System.out.println("sexo: 1. M 2. F");
        int sexo= leer.nextInt();
        System.out.println(" Estado civil: 1. Soltero 2. Casado 3.Otro");
        int EC=leer.nextInt();
        if (Edad<18 || sexo==1 && EC==2) {
            System.out.println(Nombre +", usted aun no es independiente");
            
        }else{
            System.out.println(Nombre);
        }
    }
    
}
