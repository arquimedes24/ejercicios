package TALLER1;
import java.util.Scanner;
public class EJERCICIO9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros");
        int Numero1=leer.nextInt();
        int Numero2=leer.nextInt();
        int suma=Numero1+Numero2;
        System.out.println("Los numeros son: " + Numero1 + " y " + Numero2 + " y la suma de estos es " + suma);
        
    }
    
}
