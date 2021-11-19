package laboratorio_estrucarrays;
public class Laboratorio_estrucarrays {
    public static void main(String[] args) {
        
        int J = 6;
        int Q = 8;
        int Primera_matriz[][];
        Primera_matriz = new int[J][Q];
        int segunda_matriz[][];
        segunda_matriz = new int[J][Q];
        int tercera_matriz[][];
        tercera_matriz = new int[J][Q];
        int nums[] = new int[10];
        System.out.println("Primera_matriz:");
        for (int d = 0; d < J; d++) {
            for (int t = 0; t < Q; t++) {
                int W = (int) (Math.random() * 100);
                if (W % 2 == 0 ) {
                    Primera_matriz[d][t] = W;
                    System.out.print(Primera_matriz[d][t] + "  ");
                } else {
                    t--;
                }
            }
            System.out.println();
        }
        System.out.println("matriz2:");
        for (int d = 0; d < J; d++) {
            for (int t = 0; t < Q; t++) {
                int S = (int) (Math.random() * 50);
                if (S % 2 != 0) {
                    segunda_matriz[d][t] = S;
                    System.out.print(segunda_matriz[d][t] + "  ");
                } else {
                    t--;
                }
            }
            System.out.println();
        }
        System.out.println("matriz3:");
        for (int d = 0; d < J; d++) {
            for (int t = 0; t < Q; t++) {
                tercera_matriz[d][t] = Primera_matriz[d][t]+segunda_matriz[d][t];
                System.out.print(tercera_matriz[d][t] + "  ");    
            }
            System.out.println();
            
        }
        

    }

}
        
    
    

