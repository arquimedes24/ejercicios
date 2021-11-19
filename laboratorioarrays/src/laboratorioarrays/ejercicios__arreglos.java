package laboratorioarrays;

import java.util.Scanner;

public class ejercicios__arreglos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int a[] = new int[10];
        System.out.println("Cuantos elementos: ");
        n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = teclado.nextInt();

        }
        int s = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
            s = s + a[i];
        }
        System.out.println("La suma es: " + s);
    }
}
