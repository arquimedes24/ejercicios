package ejercicio1;

import java.util.Scanner;

public class ejercicio4 {
    public static void  main (String[] args){
   Scanner lector = new Scanner(System.in);
        System.out.println("Digite el valor de A");
        double A; 
        A= lector.nextInt();
         System.out.println("Digite el valor de B");
        double B;
        B= lector.nextInt();
         System.out.println("Digite el valor de C");
        double C;
        C= lector.nextInt();
        System.out.println(" Valor inicial : A=" +A+ " B= " +B+" C= "+C);
        double I;
        I=A;
        A=B;
        C=I;
        System.out.println(" Valor intercambiado: A= " +A+" B= "+B+" C= " +C);
    }
}
