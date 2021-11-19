package taller;

public class principal {
    
    public static void main(String[] args) {
        
        Password ss=new Password ();
        ss.setLongitud(10);
        String password = "";
        ss.setPassword(password);
        ss.generar();
        ss.validar();
        System.out.println(ss.validar());
   
    }
    
    
    
}
