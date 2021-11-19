package TALLER1;
import java.util.Scanner;
public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("nombre");
        String Nombre=leer.next();
        System.out.println("edad");
        int edad=leer.nextInt();
        System.out.println("sexo: 1. M 2. F");
        int sexo= leer.nextInt();
        System.out.println("estado civil: 1. Soltero 2. Casado 3.Otro");
        int EC=leer.nextInt();
        if (edad<18 || sexo==1 && EC==2) {
            System.out.println(Nombre +", usted aun no es independiente");
            
        }else{
            System.out.println(Nombre);
        }
        
        
        
        
    }
    
}
