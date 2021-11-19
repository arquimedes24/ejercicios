package ejercici_burbuja;

public class Ejercici_Burbuja {

    public static void burbuja(int[] A) {
        int i, j, aux = 0;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
       
    }

}
