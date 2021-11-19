package ejercicio_coche;

public class Ejercicio_coche {

    public static void main(String[] args) {

        System.out.println("Tamaño:  " + args.length);
        int suma = 0, j = 0;
        if (args.length == 2) {
            for (int i = 0; i < args.length; i++) {

                System.out.println("Argumentos (" + i + ") = " + args[i]);
                try {
                    suma = suma + Integer.parseInt(args[i]);
                    j++;

                } catch (Exception e) {
                    System.out.println("no es un numero " + args[i]);
                }

            }
            if (j == 2) {
                System.out.println("la suma es = " + suma);

            } else {
                System.out.println("no ingreso enteros");
            }

        } else {
            System.out.println("Debe ser 2 numeros");
        }

    }
}


