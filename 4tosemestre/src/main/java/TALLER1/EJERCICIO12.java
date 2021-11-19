package TALLER1;
import java.util.Scanner;
public class EJERCICIO12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el numero");
        double Numero=leer.nextInt();
        double porcentaje=(Numero*5)/100;
        System.out.println("el numero es " + Numero + ", y el 5% de ese valor es " + porcentaje);
        
        
        
    }
    
}
