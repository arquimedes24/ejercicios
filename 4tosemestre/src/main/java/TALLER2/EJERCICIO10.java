package TALLER2;
import java.util.Scanner;
public class EJERCICIO10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Determine:");
        System.out.println("costo del metro cúbico");
        int CM = leer.nextInt();
        System.out.println("Ancho de la alberca");
        double N = leer.nextDouble();
        System.out.println("Largo de la alberca");
        double L = leer.nextDouble();
        System.out.println("Altura de la alberca");
        double A= leer.nextDouble();
        System.out.println("¿Cuántas albercas desea llenar?");
        double NumeroAlb=leer.nextDouble();
        double Volumen=L*N*A;
        if (NumeroAlb>0 ) {
            if (NumeroAlb>1) {
                double costo = Volumen*CM*NumeroAlb;
                System.out.println("el costo para llenar las " + NumeroAlb + " albercas es de " + costo);
            }else{
                double costo = Volumen*CM;
                System.out.println(" el costo para llenar la alberca es de " + costo);
            }
            
        }
        
    }
    
}
