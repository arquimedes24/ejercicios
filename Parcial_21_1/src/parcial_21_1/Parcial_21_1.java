package parcial_21_1;

public class Parcial_21_1 {
	public static void main(String[] args) {
            
		int pares = 0, promedio_pares = 0, suma_pares = 0, impares = 0, promedio_impares = 0, suma_impares = 0;
                for (String arg : args) {
                    if (Integer.parseInt(arg) == 0) {
                        promedio_impares = suma_impares / impares;
                        System.out.println(" Promedio impares: " + promedio_impares);
                        System.out.println("Suma de impares: " + suma_impares);
                        promedio_pares = suma_pares / pares;
                        System.out.println(" Promedio de pares: " + promedio_pares);
                        System.out.println("Suma de pares: " + suma_pares);
                        System.exit(0);
                    } else {
                        if (Integer.parseInt(arg) % 2 == 0) {
                            pares++;
                            suma_pares = suma_pares + Integer.parseInt(arg);
                        }
                        if (Integer.parseInt(arg) % 2 == 1) {
                            impares++;
                            suma_impares = suma_impares + Integer.parseInt(arg);
                        }
                    }
                }
		System.out.println("Termino sin cero(0) ");
		promedio_impares = suma_impares / impares;
		System.out.println(" Promedio de impares:" + promedio_impares);
                System.out.println("Suma de impares: " + suma_impares);
		promedio_pares = suma_pares / pares;
		System.out.println(" Promedio de pares;" + promedio_pares);
                System.out.println("Suma de pares: " + suma_pares);
                
	}

}

