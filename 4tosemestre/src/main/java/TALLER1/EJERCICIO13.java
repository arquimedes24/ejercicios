package TALLER1;
import java.util.Scanner;
public class EJERCICIO13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el nombre");
        String Nombre=leer.next();
        System.out.println("Digite salario por hora");
        int salarioPH=leer.nextInt();
        System.out.println("Digite las horas trabajadas en el periodo");
        int Horas=leer.nextInt();
        System.out.println("Digite el porcentaje de retención");
        int porcentaje=leer.nextInt();
        int salariobruto=salarioPH*Horas;
        int valorretencion=(salariobruto*porcentaje)/100;
        int salarioneto=salariobruto-valorretencion;
        System.out.println("El Salario bruto de " + Nombre + " es " + salariobruto + ", su retencion es de " + valorretencion + " y su salario neto es de " + salarioneto);
        
        
        
    }
    
}
