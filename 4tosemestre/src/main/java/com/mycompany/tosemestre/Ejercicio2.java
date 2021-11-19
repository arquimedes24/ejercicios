package com.mycompany.tosemestre;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("digite el nombre");
            String Nombre = leer.next();
            System.out.println("digite la edad");
            int Edad = leer.nextInt();
            System.out.println(" Sexo: Siendo 1: Masculino y 2: Femenino");
            int sexo = leer.nextInt();
            System.out.println(" Estado civil: Siendo 1: Soltero, 2: Casado y 3: Otro");
            int EC = leer.nextInt();
            if (Edad > 0) {
                if (sexo == 1 || sexo == 2) {
                    if (EC == 1 || EC == 2 || EC == 3) {
                        if (sexo == 1 && Edad >= 18 && EC == 1) {
                            System.out.println(Nombre + " es un hombre soltero mayor de edad ");
                        }
                    } else {
                        System.out.println("Estado civil incorrecto");
                        i--;
                    }
                } else {
                    System.out.println("sexo incorrecto");
                    i--;
                }
            } else {
                System.out.println("edad incorrecta");
                i--;
            }
        }

    }
    
}
