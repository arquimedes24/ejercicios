package ejerecicios_vectores;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         int A=5;
         double pesos[]= new double [A];
         System.out.println("digite el peso de las 5 personas ");   
        for(int i=0; i<A;i++){
            pesos[i]=lector.nextDouble();
        }
             double prom=0;
             int superan =0;
              int no_superan =0;
        
        for(int i= 0;i<A;i++){
            prom=prom+pesos[1];
        }
        prom=prom/A;
        for (int i =0;i<A ;i++){
            if (pesos[i]>prom){
            superan++;
            }else{
            no_superan++;
            }
        }
           System.out.println(" El promedio es:"+prom);     
           System.out.println("Los que superan el promedio son:" +superan);
           System.out.println("la cantidad que no supera el promedio es:"+no_superan );
    } 
}
