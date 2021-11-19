package com.mycompany.ejerciciosenclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3 {
   
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n1;
		int n2;
		int n3;
		n1 = 0;
		n2 = 0;
		n3 = 0;
		System.out.println("Digite tres numeros");
		n1 = Integer.parseInt(bufEntrada.readLine());
		n2 = Integer.parseInt(bufEntrada.readLine());
		n3 = Integer.parseInt(bufEntrada.readLine());
		if (n1>n2 && n1>n3) {
			System.out.println("El numero mayor seria "+n1);
		} else {
			if (n2>n1 && n2>n3) {
				System.out.println("El numero mayor seria "+n2);
			} else {
				if (n3>n1 && n3>n2) {
					System.out.println("El numero mayor seria "+n3);
				}
			}
		}
	}


}

    
