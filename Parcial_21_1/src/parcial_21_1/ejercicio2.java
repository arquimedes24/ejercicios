package parcial_21_1;

public class ejercicio2 {

    public static void main(String[] args) {
        if (args.length == 3) {
            int anio = Integer.parseInt(args[0]);
            int mes = Integer.parseInt(args[1]);
            int dia = Integer.parseInt(args[2]);

            boolean bien = true;
            String mensaje = "";
            if (anio < 1900 || anio > 2030) {
                mensaje = "Año fuera de rango";
                bien = false;
            } else if (mes < 1 || mes > 12) {
                mensaje = "Mes incorrecto";
                bien = false;
            } else {

                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                    mensaje = " es un mes de 30 días";
                    bien = false;
                } else if (mes == 2 && (anio % 4 == 0) && dia > 30) {
                    mensaje = "es un mes de 29 días";
                    bien = false;
                } else if (mes == 2 && (anio % 4 != 0) && dia > 28) {
                    mensaje = " es un mes de 28 días";
                    bien = false;
                } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                        && dia > 31) {
                    mensaje = " es un mes de 31 días";
                    bien = false;
                }

                if (bien) {
                    System.out.println(anio + " " + mes + " " + dia + " Esta bien");
                } else {
                    System.out.println(anio + " " + mes + " " + dia + " " + mensaje);
                }

            }
        } else {
            System.out.println("Cantidad de parametros erroneos ");
        }
    }
}
