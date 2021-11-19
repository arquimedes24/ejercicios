package actividad_estructuras;

import java.util.Scanner;

public class punto_1 {
    public static void main(String[] args) {
           int n;
        double Notas=0;
        double acu=1;
        System.out.println("Ingrese el numero de estudiantes ");
        
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
      
        while(n>=acu){
            System.out.println("Ingres la nota definitiva del estudiante " + acu);
            double nt = leer.nextDouble();
            acu =acu+1;
            Notas += nt;
        }
        double promedio = Notas/n;
        System.out.println("El promedio del curso es : " +promedio);
    }
    
}
