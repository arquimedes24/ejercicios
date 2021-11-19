package parcial_1_2021;

import java.util.Scanner;

public class Parcial_1_2021 {

    public static void main(String[] args) {
        System.out.println("Tamaño:  " + args.length);
        int div = 0, j = 0;
        for (int i = 0; i < args.length; i++) {

            System.out.println("A (" + i + ") = " + args[i]);
            try {
                div = div + Integer.parseInt(args[i]);
                j++;

            } catch (Exception e) {
                System.out.println("no es un numero " + args[i]);
            }
        }
        if (j == 2) {
            System.out.println("la suma es = " + div);

        } else {
            System.out.println("no ingreso enteros");
        }

        
        
        
    }
}
    

    
        


