package TALLER1;
import java.util.Scanner;
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite nombre");
        String Nombre=leer.next();
        System.out.println("Digite el salario por hora");
        int Salarioporhora=leer.nextInt();
        System.out.println("Digite el numero de horas que trabajó en el mes");
        double horasalmes=leer.nextInt();
        double salariomensual=Salarioporhora*horasalmes;
        System.out.println("el nombre es " + Nombre + " y su salario mensual es " + salariomensual);
        
    }
    
}
