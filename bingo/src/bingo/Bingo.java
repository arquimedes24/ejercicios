package bingo;

import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int numInicial = 1, numFinal = 75;
        String sigue = null, prompt, letra = null;
             Scanner entrada = new Scanner(System.in);
           
        do {
            long numero = Math.round(Math.random()*(numInicial-numFinal)+ numFinal);
            
            if (numero >= 1 && numero <= 15) {
                letra = "B ";
            }
            if (numero >= 16 && numero <= 30) {
                letra = "I ";
            }
            if (numero >= 31 && numero <= 45) {
                letra = "N ";
            }
            if (numero >= 46 && numero <= 60) {
                letra = "G ";
            }
            if (numero >= 61 && numero < 75) {
                letra = "O ";
            }
           
        
            
            
            System.out.println(letra+numero);
            
        } while (sigue == "S" || sigue == "s");
        System.exit(0);
    }

    private static String prompt(String desea_sacar_otra_balota_SN_) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
