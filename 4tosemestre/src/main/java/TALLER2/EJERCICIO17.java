package TALLER2;
import java.util.Scanner;
public class EJERCICIO17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el numero de cita");
        int numCita=leer.nextInt();
        if (numCita>0) {
            if (numCita<=3) {
                int total=numCita*100000;
                System.out.println("el precio de la cita es 100,000 y lleva " + total + " gastado en el tratamiento");
            }else if(numCita==4 || numCita==5){
                int total=(numCita-3)*80000+300000;
                System.out.println("el precio de la cita es 80,000 y lleva " + total + " gastado en el tratamiento");
            }else if(numCita>=6 && numCita<=8){
                int total=(numCita-5)*70000+460000;
                System.out.println("el precio de la cita es 70,000 y lleva " + total + " gastado en el tratamiento");
            }else if(numCita>8){
                int total=(numCita-8)*50000+670000;
                System.out.println("el precio de la cita es 50,000 y lleva " + total + " gastado en el tratamiento");
                
            }
            
        }
    }
    
}
