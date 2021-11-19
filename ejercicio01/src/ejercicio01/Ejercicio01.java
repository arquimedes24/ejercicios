package ejercicio01;
public class Ejercicio01 {

    public static void main(String[] args) {    
   System.out.println("Hola Mundo");
    
    x a, b;
    a=new x();
    a.imprime();
    
    b=new x(6);
    b.imprime();     
         System.out.println("Tamaño: " + args.length);
        int s = 0;
        for(int i=0; i<args.length; i++ ){
            System.out.println( "a(" + i + ") = " + args[i] );
            try{
              s = s + Integer.parseInt( args[i] );
            }catch(Exception e){
                System.out.println("No es un numero " + args[i] );
            }
        }
        System.out.println("Suma: " + s );
    }   
}    
    class x{
    int i;
      x(){
          i=5;    
      }
      x(int i){
          this.i =i;
      }
      void imprime(){
          System.out.println("i=" + i);
      }
    }