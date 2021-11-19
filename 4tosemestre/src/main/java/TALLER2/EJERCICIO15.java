package TALLER2;
import java.util.Scanner;
public class EJERCICIO15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite las tres cantitades");
        int valor1=leer.nextInt();
        int valor2=leer.nextInt();
        int valor3=leer.nextInt();
        if (valor1>valor2 && valor1>valor3 && valor2>valor3) {
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);
            
        }else if(valor1<valor2 && valor1>valor3){
            System.out.println(valor2);
            System.out.println(valor1);
            System.out.println(valor3);
        }else if(valor3>valor1 && valor3>valor2 && valor1>valor2){
            System.out.println(valor3);
            System.out.println(valor1);
            System.out.println(valor2);
        }else if(valor1>valor2 && valor1>valor3 && valor3>valor2){
            System.out.println(valor1);
            System.out.println(valor3);
            System.out.println(valor2);
        }else if(valor2>valor1 && valor2>valor3 && valor3>valor1){
            System.out.println(valor2);
            System.out.println(valor3);
            System.out.println(valor1);
            
        }else if(valor3>valor1 && valor3>valor2 && valor2>valor1){
            System.out.println(valor3);
            System.out.println(valor2);
            System.out.println(valor1);
            
        }
            
    }
    
}
