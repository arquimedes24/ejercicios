package ejer01;
public class Ejer01 {
public static void main(String[] args) {
    System.out.println("Hola Mundo");
    
    x a, b;
    a=new x();
    a.imprime();
    
    b=new x(6);
    b.imprime();       
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
    
    

