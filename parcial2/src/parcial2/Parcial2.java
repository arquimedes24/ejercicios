
package parcial2;

import java.util.Random;

public class Parcial2 {
    
    public static void main(String[] args) {
        Random randon = new Random();
		
		int [][] matriz = new int [20][20];
		for (int h = 0; h < matriz.length; h++) {
			for (int v = 0; v < matriz.length; v ++) {
				//asignacion de numero aleatorio
				matriz[h][v] =  randon.nextInt(100);
			}
                }
		String resp = "";
		for (int h = 0; h < matriz.length; h++) {
			for (int v = 0; v < matriz.length; v++) {
				resp = resp +" "+ matriz[h][v];
			}
			resp = resp + "\n";
		}
		System.out.println(resp);
                System.out.print(" primera fila");
        for (int h = 0; h < 20; h++) {
            for (int v = 0; v < 20; v++) {
                if (h==0){
                System.out.print(" " + matriz[h][v] + " ");}
            }
        System.out.println();
  }
        System.out.print(" primera columna\n ");
        for (int h = 0; h < 20; h++) {
            for (int v = 0; v < 20; v++) {
                if (v==0){
                System.out.print(" " + matriz[h][v] + " ");}
            }
            System.out.println();
        }
        System.out.print(" penúltima fila ");
        for (int h = 0; h < 20; h++) {
            for (int v = 0; v < 20; v++) {
                if (h==18){
                System.out.print(" " + matriz[h][v] + " ");}
            }
            System.out.println();
        }
        System.out.print(" última columna ");
        for (int h = 0; h < 20; h++) {
            for (int v = 0; v < 20; v++) {
                if (v==19){
                System.out.print("    " + matriz[h][v] + " ");}
            }
            System.out.println();
      
        System.out.println("");
        System.out.println("La diagonal es la siguiente: ");
        System.out.println("");
        for ( h = 0; h < matriz.length; h++) {
            for (int v=0; v < matriz[h].length; v++) {
                if (h == v) {
                    System.out.print("[" +matriz[h][v]+ "]");
                } else {
                    System.out.print("[  ]");
                }
            }  
            System.out.println("");
        }
     }
    }
}    


        
        
    
    

