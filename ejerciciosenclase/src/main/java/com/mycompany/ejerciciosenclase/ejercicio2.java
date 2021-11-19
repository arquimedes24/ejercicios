package com.mycompany.ejerciciosenclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio2 {
    
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int c;
		int n;
		System.out.println("Digite un numero");
		n = Integer.parseInt(bufEntrada.readLine());
		c = 0;
		if (n<10000) {
			while (n!=0) {
				n = (int) Math.floor(n/10);
				c = c+1;
			}
			System.out.println("El numero posee "+c+" cifras");
		} else {
			System.out.println("Esta cantidad tiene mas de 4 cifras");
		}
	}


    }
    

