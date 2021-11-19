package TALLER2;
import java.util.Scanner;
public class EJERCICIO16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite cuantas personas asistiran al banquete");
        int numPersonas=leer.nextInt();
        if (numPersonas<=90) {
            int costo=numPersonas*10000;
            System.out.println("al ser menos de 90 personas, el costo por plato es de 10,000, el precio total es de " + costo);
        }else if(numPersonas>90 && numPersonas<=150){
            int costo=numPersonas*8500;
            System.out.println("al ser mas de 90 pero menor o igual a 150 personas, el costo por plato es de 8,500, el precio total es de " + costo);
            
        }else if(numPersonas>150){
            int costo=numPersonas*7500;
            System.out.println("al ser mas de 150 personas, el costo por plato es de 7,500, el precio total es de " + costo);
        }
    }
    
}
