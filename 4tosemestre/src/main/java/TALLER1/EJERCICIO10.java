package TALLER1;
import java.util.Scanner;
public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite numero1");
        int Numero1=leer.nextInt();
        System.out.println("Digite numero2");
        int Numero2=leer.nextInt();
        System.out.println("los numeros son " + Numero1 + " y " + Numero2);
        int Suma=Numero1+Numero2;
        if (Suma<0) {
            System.out.println("La suma es " + Suma);
        }
        
    }
    
}
