
package ejemplotry_catch;

public class Ejemplotry_catch {

    public static void main(String[] args) {
        
        String cadena = "12345";
        int numero;
        
        try{
            numero=Integer.parseInt(cadena);
            System.out.println(" Dato convertido: " + numero);
        }catch(NumberFormatException e){
            System.out.println( " No es un numero es una cadena ");
        }
            
    }
    
}
