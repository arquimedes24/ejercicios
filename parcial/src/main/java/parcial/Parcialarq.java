
package parcial;

import java.util.Scanner;


    

public class Parcialarq {

 
    public static void main(String[] args) {
      double numero;
      String valor;
      int suma=0;
      int promedio;
 Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número: ");
 numero=lectura.nextInt();
  System.out.println("Divisores del numero "+numero);
 for (int i = 1 ; i< numero; i++){
     if((numero%i)==0){
         System.out.println(i);

         suma += i;
    
    
     }
 }
 if(suma == numero)
        System.out.println(numero + " es un num perfecto!");
      
      else
        System.out.println(numero +" no es un num perfecto!");
    }
    
}
    

