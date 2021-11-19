package TALLER2;
import java.util.Scanner;
public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Digite el valor del radio");
        double radio=leer.nextDouble();
        final double pi = 3.1416;
        double area =pi*(Math.pow(radio, 2));
        System.out.println("el area de la circunferencia es " + area);

        
    }
    
}
