package TALLER2;
import java.util.Scanner;
public class EJERCICIO8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite X1");
        int X1=leer.nextInt();
        System.out.println("Digite X2");
        int X2=leer.nextInt();
        System.out.println("digite Y1");
        int Y1=leer.nextInt();
        System.out.println("digite Y2");
        int Y2=leer.nextInt();
        double distancia=Math.pow(Math.pow((X2-X1), 2)+Math.pow((Y2-Y1), 2), 0.5);
        System.out.println("la distancia entre los puntos es " + distancia);
    }
    
}
