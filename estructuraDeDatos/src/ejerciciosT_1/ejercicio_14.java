
package ejerciciosT_1;

import java.util.Scanner;


public class ejercicio_14 {

    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
        System.out.println(" Ponga nombre");
        String Nombre = leer.next();
        System.out.println("Ponga salario básico");
        int salario=leer.nextInt();
        if(salario>0){
            if (salario<2000000) {
                System.out.println(" El nombre es " + Nombre + ", su salario básico es " + salario + " y no tiene retencion, su total a pagar es " + salario);

            }else if(salario>=2000000 && salario<=3000000){
                int varetencion=(salario*5)/100;
                int total=salario-varetencion;
                System.out.println("El nombre es " + Nombre + ", su salario básico es " + salario + ", su retencion es de " + varetencion + " y su total a pagar es de " + total);
                
            }else{
                int valorretencion=(salario*8)/100;
                int total=salario-valorretencion;
                System.out.println("El nombre es " + Nombre + ", su salario básico es " + salario + ", su retencion es de " + valorretencion + " y su total a pagar es de " + total);
            }
        }
    }
    
}
