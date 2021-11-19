package actividadciclos_punto1;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {
        int ne;
        double n1, n2, n3, n4;
        double acum = 1;
        double nts = 0;
        double estudiante = 0;
        double nnotas = 0;
        double tnotas = 0;
        System.out.println("Ingrese El Numero De Estuadiantes Que Cursan Ing Financiera ");
        Scanner entrada = new Scanner(System.in);
        ne = entrada.nextInt();

        while (ne >= acum) {

            System.out.println("Estudiante : " + (acum));
            System.out.println("Ingrese la nota de la materia (1)");
            n1 = entrada.nextDouble();
            System.out.println("ingrese la nota de la materia (2)");
            n2 = entrada.nextDouble();
            System.out.println("Ingrese la nota de la materia (3)");
            n3 = entrada.nextDouble();
            System.out.println("Ingrese la nota de la materia (4)");
            n4 = entrada.nextDouble();

            acum = acum + 1;

            nts = n1 + n2 + n3 + n4;
            double promedio = nts / 4;

            if (nts > 0) {
                estudiante += 1;
            }
            System.out.println("El promedio del estudiante " + "(" + estudiante + ")" + "es de : " + promedio);
            System.out.println("");
            if (n1 > 0) {
                nnotas += 1;
            }
            if (n2 > 0) {
                nnotas += 1;
            }
            if (n3 > 0) {
                nnotas += 1;
            }
            if (n4 > 0) {
                nnotas += 1;
            }

            if (n1 > 0) {
                tnotas += n1;
            }
            if (n2 > 0) {
                tnotas += n2;
            }
            if (n3 > 0) {
                tnotas += n3;
            }
            if (n4 > 0) {
                tnotas += n4;
            }

        }

        double promediogn = tnotas / nnotas;
        System.out.println("El promedio general del curso Ing financiera es de : " + promediogn);

    }

}
