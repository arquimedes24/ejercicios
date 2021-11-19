package com.mycompany.tosemestre;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite la edad");
            int Edad = Leer.nextInt();
            System.out.println("digite el nombre");
            String Nombre = Leer.next();
            if (Edad >= 0 && Edad <= 120) {
                if (Edad >= 18) {
                    System.out.println(Nombre + " Es mayor de edad ");

                } else {
                    System.out.println(Nombre + " Todavia no es mayor de edad ");
                }
            } else {
                System.out.println("La edad es incorrecta");
            }

        }

    }

}

