package parcial_2021;
public class ejercicio1_21 {
    public static void main(String[] args) {
        int positivos = 0;
        int negativos = 0;

        int ceros = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argu (" + i + ") = " + args[i]);
            try {
                if (Integer.parseInt(args[i]) > 0) {
                    positivos++;

                } else if (Integer.parseInt(args[i]) < 0) {
                    negativos++;

                } else if (Integer.parseInt(args[i]) == 0) {
                    ceros++;

                }
            } catch (Exception e) {
                System.out.println("no es numero= " + args[i]);
            }

        }
        System.out.println("los positivos son " + positivos);
        System.out.println("los negativos son " + negativos);
        System.out.println("los ceros son " + ceros);

    }

    }

    
    
    
      
    


    
    

