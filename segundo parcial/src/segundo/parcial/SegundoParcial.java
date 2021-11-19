package segundo.parcial;

import java.util.Random;

public class SegundoParcial {
    public static void main(String[] args) {
        //Instancionamos la clase randon para generar numeros aleatorios
		Random randon = new Random();
		//Creamos una matriz cuadrada de tamanio 20 x 20, es decir, 20 filas y 20 columnas
		int [][] matriz = new int [20][20];
		// dos for para recorrer cada posicion de la matriz y agregar el numero
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				//asignacion de numero aleatorio
				matriz[i][j] =  randon.nextInt(100);
			}
		}
		//imprimir respuesta
		String respuesta = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				respuesta = respuesta +" "+ matriz[i][j];
			}
			respuesta = respuesta + "\n";
		}
		System.out.println(respuesta);
        
        
               
                System.out.print(" primera fila\n ");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i==0){
                System.out.print(" " + matriz[i][j] + " ");}

            }
        System.out.println();
    
  }
        System.out.print(" primera columna\n ");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j==0){
                System.out.print(" " + matriz[i][j] + " ");}

            }
            System.out.println();
        }
        System.out.print(" penúltima fila\n ");
        for (int f = 0; f < 20; f++) {
            for (int c = 0; c < 20; c++) {
                if (f==18){
                System.out.print(" " + matriz[f][c] + " ");}
            }
            System.out.println();
        }
        System.out.print(" última columna\n ");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j==19){
                System.out.print("      " + matriz[i][j] + " ");}
            }
            System.out.println();
      
        System.out.println("");
        System.out.println("La diagonal es la siguiente: ");
        System.out.println("");
        for ( i = 0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print("[" +matriz[i][j]+ "]");
                } else {
                    System.out.print("[  ]");
                }
            }  
            System.out.println("");
        }
     }
    }
}    

