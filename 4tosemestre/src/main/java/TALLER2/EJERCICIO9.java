package TALLER2;
import java.util.Scanner;
public class EJERCICIO9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese las medidas en metros");
        double medidas=leer.nextDouble();
        double pulgadas=Math.round(medidas/0.0254);
        System.out.println(medidas + " metros son " + pulgadas + " pulgadas");
        
    }
    
}
