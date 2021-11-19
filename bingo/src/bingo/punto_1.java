
package bingo;

import java.util.Scanner;

public class punto_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Digite el tamaño del arreglo: ");
        int a = entrada.nextInt();
        int arreglo[] = new int[a];
        int v;
        int g=a-2;
        System.out.println("Digite los valores del arreglo: ");
        for (int i = 0; i < a; i++) {
            System.out.print("[" + i + "] = ");
            arreglo[i] = entrada.nextInt();
        }
        v= arreglo[a-1];
        for (int i = g; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = v;
        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arreglo[i]+" ");
        }
       }
    
}
