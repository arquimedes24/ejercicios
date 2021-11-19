package parcial_2co;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Parcial_2co {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo[], ce, b;
        ce = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de espacios  "));
        arreglo = new int[ce];
        for (int i = 0; i < ce; i++) {
            System.out.println((i + 1) + "  Digite numero  ");
            arreglo[i] = leer.nextInt();
        }
        for (int i = 0; i < ce; i++) {
            for (int j = 0; j < ce - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    b = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = b;
                }
            }
        }

        System.out.print("\nArreglo ordenado : ");
        for (int i = 0; i < ce; i++) {
            System.out.print(arreglo[i] + "   ");
        }
        System.out.println("");
    }
}
