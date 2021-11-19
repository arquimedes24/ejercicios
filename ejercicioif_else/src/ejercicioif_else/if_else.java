
package ejercicioif_else;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
    int opc = 0;
       System.out.println(" Ingrese la opción que desea. ");   
         //System.out.println(" 1. lunes.");
         //System.out.println(" 2. martes ");
         //System.out.println(" 3. miercoles");
         //System.out.println(" 4. jueves ");
         //System.out.println(" 5. viernes");
         //System.out.println(" 6. sabado");
       //  System.out.println(" 7.domingo");
         Scanner leer=new Scanner(System.in);
          opc = leer.nextInt();
        
        switch(opc){
             case 1:
                 System.out.println("lunes");
                 
                 break;
             case 2:
                 System.out.println("martes");
                 
                 break;
             case 3:
                 System.out.println("miercoles");                 
                 break;
                 case 4:
                     System.out.println("jueves");                 
                 break;
             case 5:
                 System.out.println("viernes");
                 
                 break;
             case 6:
                 System.out.println("sabado");                 
                 break;
                 case 7:
                     System.out.println("dominfo");                 
                 break;
                 
             default:
                 System.out.println("la opcion seleccionada no es valida");
        
        
    }
}
    
