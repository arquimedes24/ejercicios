package TALLER1;
import java.util.Scanner;
public class EJERCICIO15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("digite el nombre");
        String Nombre=leer.next();
        System.out.println("digite el salario básico por hora");
        int salarioPH=leer.nextInt();
        System.out.println("digite el numero de horas trabajadas durante la semana");
        int horas=leer.nextInt();
        if(horas>0){
            if (horas>48) {
                int porcentajederecargo=(salarioPH*35)/100;
                int valorhoraextra=salarioPH+porcentajederecargo;
                int horasextras=horas-48;
                int valordelrecargo=valorhoraextra*horasextras;
                int sueldo=salarioPH*horas;
                int salariototal=valordelrecargo+sueldo;
                System.out.println("el nombre es " + Nombre + " y el sueldo es " + salariototal);

            }else{
                int salario=salarioPH*horas;
                System.out.println("el nombre es " + Nombre + " y no tiene horas extras, su sueldo es " + salario);
            }
            
        }
        
    }
    
}
