
import javax.swing.JOptionPane;


public class justicia_divina {
    public static void main(String[] args) {
        int f, c, n, m;
        int a[][];
        int b[][];
        int acumf = 0, acumc = 0;
        JOptionPane.showMessageDialog(null, "Ingrese el tamaño de la matriz ");
        f = Integer.parseInt(JOptionPane.showInputDialog(" Primero digite el numero de filas"));
        acumf += f;
        c = Integer.parseInt(JOptionPane.showInputDialog("Ahora ingrese el numero de columnas"));
        acumc += c;
        a = new int[f][c];
        for (n = 0; n < f; n++) {
            for (m = 0; m < c; m++) {
                a[n][m] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la matriz en la fila " + (n + 1) + " de la columna " + (m + 1)));
            }
        }
        System.out.println("La matriz ingresada es");
        for (int x = 0; x < f; x++) {
            for (int y = 0; y < c; y++) {
                System.out.print(a[x][y] + "\t");
            }
            System.out.println("");
        }
        System.out.println("La matriz ingresada despues de aplicarle la Justicias DIvina 2.0, da:");
        b = new int[f][c];
        for (int x = f - 1; x >= 0; x--) {
            for (int y = c - 1; y >= 0; y--) {

                b[x][y] += 1;
                b[x][y] = a[x][y];

                System.out.print(b[x][y] + "\t");
              }
            System.out.println("");
        }

    }
}

