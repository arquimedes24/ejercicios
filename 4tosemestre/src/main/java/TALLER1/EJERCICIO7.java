package TALLER1;

import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        int Numero1, Numero2;
        System.out.println("ingrese los numeros");
        Numero1=Leer.nextInt();
        Numero2=Leer.nextInt();
        if (Numero1>0 && Numero2>0) {
            System.out.println(Numero1 + " y " + Numero2 + " Son positivos "); 
            
        }
    }
    
}
