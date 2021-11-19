package TALLER2;
import java.util.Scanner;
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite el numero1");
        double numero1= leer.nextDouble();
        System.out.println("Digite numero 2");
        double numero2=leer.nextDouble();
        
        if (numero1>numero2) {
            System.out.println("el " + numero1 + " es el mayor");
            
        }else if(numero2>numero1){
            System.out.println("el " + numero2 + " es el mayor");
            
        }else{
            System.out.println("ambos son iguales");
        }
    }
    
}
