
package ejercicosfor;

public class ejercicio_3 {
     public static void  main (String[] args){
     int q;
     int w;
     int e;
     w=6;
     e=0;
        System.out.println(" El numero es "+w);
        System.out.println(" Los divisores porpioos son ");
        for (q = 1;q<=5;q++){
            if(w % q ==0){
                System.out.println(q);
                e = e +1;
            }
        } System.out.println("La suma de los divisores propios es " +e);
                if (e==w){
                    System.out.println("El numero es perfecto");        
                }
    
    }
}

    

