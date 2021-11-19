package TALLER1;

import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite el numero");
        int numero = leer.nextInt();
        if (numero<0) {
            int Valorab=numero*(-1);
            System.out.println("el valor absoluto de " + numero + " es: " + Valorab);
        }else if(numero==0){
            System.out.println("cero no tiene valor absoluto");
        }else{
            System.out.println("el valor absoluto es " + numero);
        }
       
        
    }
    
}
