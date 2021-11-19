package bingo;

import java.util.Scanner;

public class bingo_ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int a = leer.nextInt();
        int n[] = new int[a];
        for (int j = 0; j < n.length; j++) {
            System.out.println("Digite un número:");
            n[j] = leer.nextInt();
            if (n[j] == 0) {
                System.out.println(" Termino ");
                System.exit(0);
            } else {
                if (n[j] >= 1 && n[j] <= 15) {
                    System.out.println(n[j] + " Letra B");
                } else {
                    if (n[j] >= 16 && n[j] <= 30) {
                        System.out.println(n[j] + " Letra I");
                    } else {
                        if (n[j] >= 31 && n[j] <= 45) {
                            System.out.println(n[j] + " Letra N");
                        } else {
                            if (n[j] >= 46 && n[j] <= 60) {
                                System.out.println(n[j] + " Letra G");
                            } else {
                                if (n[j] >= 61 && n[j] <= 75) {
                                    System.out.println(n[j] + " Letra O");
                                } else {
                                    System.out.println("fuera de rango");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
