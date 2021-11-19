package laboratorioarrays;

import java.util.Scanner;

public class es1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n = 0, i, j;
        int a[] = new int[10];
        System.out.println("cuantos elementos: ");
        n = teclado.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = teclado.nextInt();
        }
        i = 0;
        j = a.length - 1;
        while (i < j) {
            if (a[i] == a[j]) {

                i++;
                j++;
            } else {
                break;
            }
            if (i < j) {
                System.out.println("No es palindrome ");
            } else {
                System.out.println("Es palindrome ");
            }
        }

    }

}
