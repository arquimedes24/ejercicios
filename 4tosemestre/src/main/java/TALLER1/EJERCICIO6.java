package TALLER1;

import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        int Numero1, Numero2;
        System.out.println("ingrese los numeros");
        Numero1=Leer.nextInt();
        Numero2=Leer.nextInt();
        System.out.println("el(los) positivo(s) es(son): ");
        if (Numero1>0) {
            System.out.println(Numero1);
        }
        if(Numero2>0){
            System.out.println(Numero2);
        }
        if (Numero1<=0 && Numero2<=0) {
            System.out.println("No hay positivos");
            
        }
            
        
        
    }
    
}
