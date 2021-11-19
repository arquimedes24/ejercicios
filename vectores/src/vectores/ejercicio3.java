
package vectores;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("ingrese la palabra");
        String palabr=lee.next();
        char cant[]=new char [palabr.length()];
        for (int z =0;z < palabr.length();z++){
            cant[z]=palabr.charAt(z);
            System.out.println("La letra en la posición"+ z +" es "+cant[z]);
        }
        System.out.println("eL arreglo esta con las siguientes  "+palabr.length()+ " posiciones ");
    }
}