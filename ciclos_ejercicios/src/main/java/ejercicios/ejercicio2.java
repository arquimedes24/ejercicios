package ejercicios;


public class ejercicio2 {
    public static void  main (String[] args){
    
    
       int n1;
       int a;
       a = 32;
        System.out.println("El numero es "+ a);
        System.out.println("Sus divisores son ");
        for(n1 = 1; n1 <= a;n1++){
            if(a % n1 == 0){
                System.out.println(n1);
            } 
        }
    }
    
}

