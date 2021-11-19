package ejercicios;
public class ejercicio9 {
    public static void main(String[]args){
        int a;
        int s;
        s = 15;
        double d;
        int q;
        int w;
        int g;
        System.out.println("El numero que se definio es: " + s);
        int e = 0;
        for(a = 0; a <= s ; a++){
            e = (int)(e+a);
        }
        System.out.println("La suma  es "+e);
        double f=Math.sqrt(e);
        System.out.println(" la raiz es "+f );
        int num=(int)Math.floor(Math.random()*e+1);
        System.out.println("el numero aleatorio es"+num);
        System.out.println("los diviisore son");
        for (g=1;g<=e;g++){
            if (e%g==0){
                System.out.println(g);
            }
        }
        d = 1;
        for (q=e;q>=1;q--){
            d=d*q;
        }
        System.out.println("el factorial es: " + d);
        w=0;
       
            
       
    }
    
}
