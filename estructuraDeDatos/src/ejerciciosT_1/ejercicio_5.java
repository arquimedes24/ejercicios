
package ejerciciosT_1;

import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
 
      Scanner leer = new Scanner (System.in);
        System.out.println(" Digite el numero");
        int num = leer.nextInt();
        if (num<0) {
            int valor=num*(-1);
            System.out.println("el valor absoluto de " + num + " es: " + valor);
        }else if(num==0){
            System.out.println("cero no tiene valor absoluto");
        }else{
            System.out.println("el valor absoluto es " + num);
        }
       }
    
}
