
package ejercicosfor;


public class ejercicio_2 {
    public static void  main (String[] args){
    
    
       int n3;
       int z;
       z = 32;
        System.out.println("El numero es "+ z);
        System.out.println("Sus divisores son ");
        for(n3 = 1; n3 <= z;n3++){
            if(z % n3 == 0){
                System.out.println(n3);
            } 
        }
    }
    
}

