package vectores;

import java.util.Scanner;

public class Vectores {
    //ejercicio 1
    public static void main(String[] args) {
      Scanner lee = new Scanner(System.in);
         int m=5;
         double pesos[]= new double [m];
         System.out.println("digite el peso de las 5 personas ");   
        for(int i=0; i<m;i++){
            pesos[i]=lee.nextDouble();
        }
             double prome=0;
             int superan =0;
              int nosuperan =0;
        
        for(int i= 0;i<m;i++){
            prome=prome+pesos[1];
        }
        prome=prome/m;
        for (int i =0;i<m ;i++){
            if (pesos[i]>prome){
            superan++;
            }else{
            nosuperan++;
            }
        }
           System.out.println(" El promedio es:"+prome);     
           System.out.println("Los que superan el promedio son:" +superan);
           System.out.println("la cantidad que no supera el promedio es:"+nosuperan );
    } 
}

        
        

    

