package ejerecicios_vectores;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         int H=10;
         int J=10;
          double notaPG[]= new double[H];
          double notaSG[]= new double[J];
     
          System.out.println("digite las notas del primer grupo");   
        for(int q = 0; q < H; q++){
            notaPG[q]=lector.nextDouble();
        }
          System.out.println("digite las notas del segundo grupo");   
        for(int w = 0; w < J; w++){
            notaSG[w]=lector.nextDouble();
        }
        double prom1=0;
        double prom2=0;
     for(int q=0;q<H;q++){
        prom1=prom1+notaPG[q];
        }
        double totalnotaPG=prom1/H;
         for(int w=0;w<J;w++){
        prom2=prom2+notaSG[w];
        }
        double totalnotaSG=prom2/J;
  
        System.out.println("El promedio del primer grupo es:"+totalnotaPG);
        System.out.println("El promedio del segundo  grupo es:"+totalnotaSG);
        double promG=(prom1+prom2)/2;
        System.out.println("El promedio general de los dos grupos es:"+promG);
        if(totalnotaPG>totalnotaSG){
            System.out.println("El primer grupo obtuvo el mejor promedio");
        }
        else{
        System.out.println("El segundo grupo obtuvo el mejor promedio");
       
        }
    }   
}       
   