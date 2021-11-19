package com.mycompany.ejerciciosenclase;


import java.util.Scanner;

public class ejercicio4 {
    
    	public static void main(String args[]) {
            Scanner entrada = new Scanner(System.in);
	 
                    int porcentaje;
                    porcentaje = 0;
                    
                System.out.println(" digite el porcentaje ");
		porcentaje = entrada.nextInt();
		if (porcentaje<50) {
			System.out.println("Se Encuentra Fuera del nivel Su porcentaje es de "+porcentaje);
		} else {
			if (porcentaje<=75) {
				System.out.println("Su porcentaje es de un Nivel Regular "+porcentaje);
			} else {
				if (porcentaje<=90) {
					System.out.println("Su porcentaje es de un Nivel Medio "+porcentaje);
				} else {
					if (porcentaje>90) {
						System.out.println("Su porcentaje es de un Nivel Maximo "+porcentaje);
					}
				}
			}
		}
        }

}


    

