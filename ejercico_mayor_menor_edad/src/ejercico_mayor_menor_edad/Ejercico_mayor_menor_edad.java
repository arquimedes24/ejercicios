package ejercico_mayor_menor_edad;
import java.util.Scanner;
public class Ejercico_mayor_menor_edad {
    public static void main(String[] args){
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dia de la semana ");
        n=leer.nextInt();
        if (n==1)
            System.out.println("Lunes");
        else if(n==2)
            System.out.println("Martes");
        else if(n==3)
            System.out.println("Miercoles");
        else if(n==4)
            System.out.println("jueves");
            else if(n==5)
            System.out.println("viernes");
        else if(n==6)
            System.out.println("sabado");
        else if(n==7)
            System.out.println("domingo ");
        else 
            System.out.println("Error");
    }   
}
    

