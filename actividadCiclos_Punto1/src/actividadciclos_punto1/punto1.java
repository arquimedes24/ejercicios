
package actividadciclos_punto1;

import java.util.Scanner;

public class punto1 {

    public static void main(String[] args) {
        int ne;
        double notas=0;
        double acum=1;
        System.out.println("Ingrese el numero de estudiantes que cursan el semestre de ING sistemas");
        
        Scanner entrada = new Scanner(System.in);
        ne=entrada.nextInt();
        
      
        while(ne>=acum){
            System.out.println("Ingres la nota definitiva del estudiante " + acum);
            double nt = entrada.nextDouble();
            acum =acum+1;
            notas += nt;
        }
        double promedio = notas/ne;
        
        
        System.out.println("El promedio del curso en el semestre es de : " +promedio);
        
        
        
        





    }
    
}
