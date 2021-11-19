package proyecto1;

import java.util.Scanner;

public class proyecto1 {
     public static void  main (String[] args){
    Scanner lector = new Scanner(System.in);
    
     int opc;
     double pulgadas,milimetros = 0,yardas,metros,millas,kilometros;
         System.out.println(" Ingrese la opción que desea. ");   
         System.out.println(" 1. Pulgadas a milimetros.");
         System.out.println(" 2. yardas a metros ");
         System.out.println(" 3. millas a kilometros ");  
         
         opc = lector.nextInt();
         
         switch(opc){
             case 1:
                 System.out.println("Ingrese la cantidad de pulgadas a convertir");
                 pulgadas = lector.nextDouble();
                 milimetros = pulgadas = 25.4;
                 System.out.println(pulgadas+"pulgadas equivalen a "+milimetros+" milimetros ");
                 break;
             case 2:
                 System.out.println("Ingrese la cantidad de yardas a convertir");
                 yardas = lector.nextDouble();
                 metros = yardas  = 0.9144;
                 System.out.println(yardas+"yardas equivalen a "+metros+" metros. ");
                 break;
             case 3:
                 System.out.println("Ingrese la cantidad de millas a convertir");
                 millas = lector.nextDouble();
                 kilometros = millas = 1.6093;
                 System.out.println(millas+"millas equivalen a "+kilometros+" kilometros ");
                 break;
                 
             default:
                 System.out.println("la opcion seleccionada no es valida");
         }
         
    }
}
