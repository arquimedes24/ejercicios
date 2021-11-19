package parcial_21_1;

public class ejercico_3 {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {

            String respuesta = esPrimo(Integer.parseInt(args[i]));
            System.out.println(args[i] + respuesta);
        }

    }

    public static String esPrimo(int numero) {
        int contador = 0;

        for (int I = 1; I <= numero; I++) {
            if ((numero % I) == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            return " El numero es primo";
        } else {
            return " El numero no es primo";
        }
    }

}
