package ejercicios;

import java.util.Scanner;


public class ejercicio1 {
    
    public static void  main (String[] args){
    Scanner lector = new Scanner(System.in);
        int num = 6;
        int fac = 1;
        for (int i=6;i>0;i--,num--){
            fac=fac*num;
        }
        System.out.println("El factorial es "+fac );
    }
}
