
package arraylaboratorio;

public class Arraylaboratorio {

    
    public static void main(String[] args) {
         int P= 10;
        int Z = 7;
        int matriz[][];
        matriz = new int[P][Z];
        int matrizB[][];
        matrizB = new int[P][Z];
        int matrizC[][];
        matrizC = new int[P][Z];
        int nums[] = new int[38];
        System.out.println("matriz:");
        for (int g = 0; g < P; g++) {
            for (int v = 0; v < Z; v++) {
                int X = (int) (Math.random() * 100);
                if (X % 2 == 0 ) {
                    matriz[g][v] = X;
                    System.out.print(matriz[g][v] + "  ");
                } else {
                    v--;
                }
            }
            System.out.println();
        }
        System.out.println("matriz2:");
        for (int g = 0; g < P; g++) {
            for (int v = 0; v < Z; v++) {
                int Y = (int) (Math.random() * 50);
                if (Y % 2 != 0) {
                    matrizB[g][v] = Y;
                    System.out.print(matrizB[g][v] + "  ");
                } else {
                    v--;
                }
            }
            System.out.println();
        }
        System.out.println("matriz3:");
        for (int g = 0; g < P; g++) {
            for (int v = 0; v < Z; v++) {
                matrizC[g][v] = matriz[g][v]+matrizB[g][v];
                System.out.print(matrizC[g][v] + "  ");    
            }
            System.out.println();
        }  
    } 
}
