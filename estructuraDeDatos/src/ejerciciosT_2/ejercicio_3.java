package ejerciciosT_2;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
        System.out.println(" Digite la nota del primer corte");
        double nota1=leer.nextDouble();
        System.out.println(" Digite la nota del segundo corte");
        double nota2=leer.nextDouble();
        System.out.println(" Digite la nota del tercer corte");
        double nota3=leer.nextDouble();
        double valorcorte1= nota1*0.3;
        double valorcorte2= nota2*0.3;
        double valorcorte3= nota3*0.4;
        double notafinal= valorcorte1+valorcorte2+valorcorte3;
        System.out.println(" La nota final es " + notafinal);
        
    }
    
}
