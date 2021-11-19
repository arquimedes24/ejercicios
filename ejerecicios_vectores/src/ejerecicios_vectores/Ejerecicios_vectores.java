package ejerecicios_vectores;
//EJERCICIO 3

import java.util.Scanner;

public class Ejerecicios_vectores {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la palabra");
        String pala=lector.next();
        char cant[]=new char [pala.length()];
        for (int a =0;a < pala.length();a++){
            cant[a]=pala.charAt(a);
            System.out.println("La letra en la posición"+ a +" es "+cant[a]);
        }
        System.out.println("EL arreglo esta conformado por "+pala.length()+ " posiciones ");
    }
    
}
