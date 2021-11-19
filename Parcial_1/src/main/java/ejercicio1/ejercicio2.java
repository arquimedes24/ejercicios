package ejercicio1;
import java.util.Scanner;
public class ejercicio2 {
    
    public static void  main (String[] args){
    Scanner lector = new Scanner(System.in);
         System.out.println(" Elija el tipo de operador ");
         System.out.println(" 1. suma,2. resta,3. modulo,4. producto,5. division,6. mayor igual,7.menor o igual,8. mayor que");
         int operador = lector.nextInt();
         System.out.println(" El numero 1 es 30 ");
         int numero1=40;
         System.out.println(" El numero 2 es 3 ");
         int numero2=20;
         if (operador==1){
             int total1=numero1+numero2;
             System.out.println(" La suma de los dos numeros es "+ total1);
         }
         else if(operador==2){
          int total2=numero1-numero2;
             System.out.println(" La resta de los dos numeros es "+ total2);
         }
           else if(operador==3){
          int total3=numero1%numero2;
             System.out.println(" El resto de la division entre 30 y 3 es "+ total3);
             System.out.println(" 20 es multiplo de 2 ");
           }
         else if(operador==4){
          int total4=numero1*numero2;
             System.out.println(" El resultado de la multiplicacion es  "+ total4);
            }
         else if(operador==5){
          int total5=numero1/numero2;
             System.out.println(" El resultado de la division es "+ total5);
            }
          else if(operador==6){
                if (numero1>=numero2){
                     System.out.println(" 20 es mayor o igual a 2 ");
                }
                else {
                    System.out.println("20 no es mayor o igual a 2 ");
                }
            }
         else if(operador==7){
                if (numero1<=numero2){
                     System.out.println(" 20 es menor o igual a 2 ");
                }
                else {
                    System.out.println(" 20 no es menor  o igual a 2 ");
                }
            }
         else if(operador==8){
                if (numero1!=numero2){
                     System.out.println(" 20 es diferente a 2 ");
                }
         }      
    }
}
