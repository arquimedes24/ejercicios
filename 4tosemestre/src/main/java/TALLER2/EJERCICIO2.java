package TALLER2;
import java.util.Scanner;
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite la base");
        double Base=leer.nextDouble();
        System.out.println("digite la altura");
        double altura=leer.nextDouble();
        double area = Base*altura;
        System.out.println("el area del rectángulo por sus dimensiones es de " + area);
        
        
    }
    
}
