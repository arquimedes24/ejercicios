package actividadciclos_punto1;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numer de clientes ");
        int numClien = leer.nextInt();
        int a = 0;
        int s = 0;
        int z=1;
        int valorV = 0;
        int lecturas[][] = new int[numClien][2];
        while (a < numClien) {
            s=0;
            System.out.println("datos cliente "+ z);
            System.out.println("Lectura anterior:");
            lecturas[a][s] = leer.nextInt();
            s++;
            System.out.println("Lectura actual :");
            lecturas[a][s] = leer.nextInt();
            a++;
            z++;
        }
        System.out.println("Costo del vatio:");
        valorV = leer.nextInt();
        
        a = 0;
        s = 0;
        
        int lecturaAct = 0, lecturaAnt = 0;
        
        int valorF = 0;
        
        int sumaValores = 0;
        z= 0;
        
        while (a < numClien) {
            s=0;
            lecturaAnt = lecturas[a][s];
            s++;
            lecturaAct = lecturas[a][s];

            valorF = (lecturaAct - lecturaAnt) * valorV;
            sumaValores = sumaValores + valorF;
            System.out.println("Valor a pagar cliente " + z+ " = " + valorF);
            a++;
            z++;
        }
        int prom = (sumaValores / numClien);
        System.out.println("El promedio de facturas es: = " + prom);
    }

}
