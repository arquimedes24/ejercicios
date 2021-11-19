package TALLER2;
import java.util.Scanner;
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite numero1");
        int numero1= leer.nextInt();
        System.out.println("digite numero2");
        int numero2= leer.nextInt();
        
        int Suma=numero1+numero2;
        System.out.println("la suma de " + numero1 + " y " + numero2 + " es " + Suma);
        
        
    }
    
}
