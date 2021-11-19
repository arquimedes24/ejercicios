
public class Secamttest {
    
    
    public static void main(String[] args) {
        Funcion f=new Funcion("x^ 2-2");
        Secant s= new Secant ();
        System.out.println(s.raiz(f, 3, 4, 100, 1e-6));
        
        
        
    }
    
}
