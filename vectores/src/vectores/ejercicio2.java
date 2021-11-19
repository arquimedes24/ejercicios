
package vectores;

import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         int p=10;
         int o=10;
        double notaPrimer[]= new double[p];
          double notaSegundo[]= new double[o];
     
          System.out.println("digite las notas del primer grupo");   
        for(int s = 0; s < p; s++){
            notaPrimer[s]=lector.nextDouble();
        }
          System.out.println("digite las notas del segundo grupo");   
        for(int c = 0; c < o; c++){
            notaSegundo[c]=lector.nextDouble();
        }
        double prome1=0;
        double prome2=0;
     for(int q=0;q<p;q++){
        prome1=prome1+notaPrimer[q];
        }
        double totalnotaPG=prome1/p;
         for(int w=0;w<o;w++){
        prome2=prome2+notaSegundo[w];
        }
        double totalnotaSG=prome2/o;
  
        System.out.println("El promedio del primer grupo es"+totalnotaPG);
        System.out.println("El promedio del segundo  grupo es"+totalnotaSG);
        double promG=(prome1+prome2)/2;
        System.out.println("El promedio general de los dos grupos es:"+promG);
        if(totalnotaPG>totalnotaSG){
            System.out.println("El primer grupo tuvo el mejor promedio");
        }
        else{
        System.out.println("el segundo grupo tuvo el mejor promedio");
       
        }
    }   
}       
    

