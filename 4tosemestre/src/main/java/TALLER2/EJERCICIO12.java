package TALLER2;
import java.util.Scanner;
public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite el numero");
        int numero=leer.nextInt();
        if (numero>0) {
            System.out.println("el numero " + numero + " es positivo");  
        }else if(numero<0){
            System.out.println("el numero " + numero + " es negativo");
        }else{
            System.out.println("el numero es cero");
        }
        
    }
    
}
