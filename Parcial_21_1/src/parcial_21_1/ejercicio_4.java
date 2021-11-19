package parcial_21_1;

public class ejercicio_4 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error, cantidad de parameteros invalidos");
        } else {

            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            System.out.println("dividendo: " + dividendo);
            System.out.println("divisor: " + divisor);
            int cociente = 0;
            int residuo = 0;

            int tmp = dividendo;
            while (tmp >= divisor) {
                tmp = tmp - divisor;
                cociente++;
            }
            residuo = tmp;

            System.out.println("cociente: " + cociente);
            System.out.println("residuo: " + residuo);

        }
    }
}
