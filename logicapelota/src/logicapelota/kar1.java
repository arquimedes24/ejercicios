
package logicapelota;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;





public class kar1{

    static int binario[][];
    static String cabecera[] = {"p", "q", "r", "s", "t", "m"};
    static String tipo[] = {"p y q", "q v r", "p -> (p y q)", "p <-> (p y q)", "p xor (p y q)"};
    static int variable = 4;

    public static void main(String[] args) {
        // matriz tamaño 

        binario = new int[(int) (Math.pow(2, variable))][variable];

        for (int d = 0; d < binario[0].length; d++) {

            boolean dato = false;
            System.out.print(cabecera[d] + "  ");

            for (int i = 0; i < binario.length; i++) {

                if (i % Math.pow(2, (binario[0].length - d - 1)) == 0) {
                    if (dato == false) {
                        dato = true;
                    } else {
                        dato = false;
                    }
                }
                if (dato == false) {
                    binario[i][d] = 1;
                } else {
                    binario[i][d] = 0;
                }

            }

        }
        System.out.print(" " + tipo[0] + " | " + tipo[1] + " | " + tipo[2] + " | " + tipo[3] + " | " + tipo[4]);
        System.out.println();
        for (int i = 0; i < binario.length; i++) {
            for (int t = 0; t < binario[0].length; t++) {
                System.out.print(binario[i][t] + "  ");

            }
            int pyq = binario[i][0] & binario[i][1];
            System.out.print("   " + (binario[i][0] & binario[i][1]) + "   ");
            System.out.print("    " + (binario[i][1] | binario[i][2]) + "  ");
            if (binario[i][0] == 1 && pyq==0){
                System.out.print("        0   ");
            }else{
                System.out.print("        1   ");
            }
            if (binario[i][0] == 1 && pyq==0 ||binario[i][0] == 0 && pyq==1 ){
                
                System.out.print("            0   ");
            }else{
                System.out.print("            1   ");
            }
            if (binario[i][0] == pyq){
                
                System.out.print("            0   ");
            }else{
                System.out.print("            1   ");
            }
            System.out.println();
            
        }

    }

}
    
     

