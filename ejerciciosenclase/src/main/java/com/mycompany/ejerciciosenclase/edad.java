package com.mycompany.ejerciciosenclase;
import java.util.Scanner;
public class edad{
    public static void  main (String[] args){
    Scanner Leer = new Scanner(System.in);
    int edad;
    edad = Leer.nextInt();
         System.out.println("ingrese la edad");
         if( edad >= 1 && edad <= 17){
             System.out.println(" Menor de edad ");
       }else if( edad >= 18 && edad <= 61){
             System.out.println(" Mayor de edad ");
       }else if( edad >= 62 ){
             System.out.println(" Pensionado  ");
       }
       
  
      
       }
    
    
    
    }

