package TALLER2;
import java.util.Scanner;
public class EJERCICIO13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el numero de lápices");
        int numLapices= leer.nextInt();
        if (numLapices>0) {
            if (numLapices>=1000) {
                System.out.println("el precio a pagar es de 1,100");
            }else{
                System.out.println("el precio es de 1,300");
            }
        }
        
        
    }
    
}
