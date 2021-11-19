package matriz_caracol;

public class Matriz_Caracol {

    public static void main(String[] args) {
        int n =5 ;
        String[][] matriz = new String[5][5];
        int a = 0;
        int b = n - 1;
        int valor = 1;

        for (int j = 0; j < matriz.length; j++) {

            //se llena la fila superior
            for (int i = a; i <= b; i++) {
                matriz[a][i] = valor++ + " \u2192 \t";
            }
            //se llena la columna del extremo derecho
            for (int i = a + 1; i <= b; i++) {
                matriz[i][b] = valor++ + " \u2193 \t";
            }
            //se llena la fila inferior de derecha a izquierda
            for (int i = b - 1; i >= a; i--) {
                matriz[b][i] = valor++ + " \u2190 \t";
            }
            //se llena la columna del extremo izquierdo de abajo hacia arriba
            for (int i = b - 1; i >= a + 1; i--) {
                matriz[i][a] = valor++ + " \u2191 \t";
            }
            a++;
            b--;

        } //fin ciclo externo
        for (int f = 0; f < matriz.length; f++) {
            for (int i = 0; i < matriz[f].length; i++) {

                System.out.print(matriz[f][i]);
            }
            System.out.println();//cambiamos de fila, salto de linea
        }

    }
}
