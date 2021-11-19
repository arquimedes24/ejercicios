
package actividad_estructuras;

import java.util.Scanner;


public class punto_5 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numer de clientes ");
        int numClien = entrada.nextInt();
        int i = 0;
        int j = 0;
        int k=1;
        int valorVatio = 0;
        int lecturas[][] = new int[numClien][2];
        while (i < numClien) {
            j=0;
            System.out.println("datos cliente "+ k);
            System.out.println("Lectura anterior:");
            lecturas[i][j] = entrada.nextInt();
            j++;
            System.out.println("Lectura actual :");
            lecturas[i][j] = entrada.nextInt();
            i++;
            k++;
        }
        System.out.println("Costo del vatio:");
        valorVatio = entrada.nextInt();
        i = 0;
        j = 0;
        int lecturaAct = 0, lecturaAnt = 0;
        int valorFact = 0;
        int sumaValores = 0;
        k= 0;
        while (i < numClien) {
            j=0;
            lecturaAnt = lecturas[i][j];
            j++;
            lecturaAct = lecturas[i][j];

            valorFact = (lecturaAct - lecturaAnt) * valorVatio;
            sumaValores = sumaValores + valorFact;
            System.out.println("Valor a pagar cliente " + k+ " = " + valorFact);
            i++;
            k++;
        }
        int prom = (sumaValores / numClien);
        System.out.println("El promedio de facturas es: = " + prom);
    }
    
}
