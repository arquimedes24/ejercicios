package com.mycompany.ejerciciosenclase;
public class ejercicio {
     public static void main(String[]args){
         double nota[]= new double[5];
        int porcentaje[]= {20,10,30,20,20};
      
        
        nota[0]= 3.8;//posicion 1
        nota[1]= 2.5;
        nota[2]= 4.2;
        nota[3]= 3.9;
        nota[4]= 4.0;//posicion 5
        
       //promedio = (sumaTotal numeros) / cantidad de operandos.
        
        double promedio = 0;
        double prom= 0;
        
        for (int i = 0; i < nota.length; i++) {
            promedio = (nota[i] * porcentaje[i])+promedio;
           prom = promedio/100;
            
        }
          System.out.println(Math.round(prom));
        
        
    }
}
         
     
    

