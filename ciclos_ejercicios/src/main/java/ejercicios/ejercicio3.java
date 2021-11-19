package ejercicios;

public class ejercicio3 {
    public static void  main (String[] args){
     int a;
     int s;
     int d;
     s=6;
     d=0;
        System.out.println(" El numero es "+s);
        System.out.println(" Los divisores porpioos son ");
        for (a = 1;a<=5;a++){
            if(s % a ==0){
                System.out.println(a);
                d = d +1;
              
            }
        }
             System.out.println("La suma de los divisores propios es " +d);
                if (d==s){
                    System.out.println("El numero es perfecto");        
                }
    
    }
}
