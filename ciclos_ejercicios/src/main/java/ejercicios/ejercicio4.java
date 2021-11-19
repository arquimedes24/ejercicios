
package ejercicios;
public class ejercicio4 {
    public static void main(String[]args){
        String palabra= "programacion";
        String invertida="";
        int posi;
        for(posi = palabra.length()-1;posi>=0;posi--){
            invertida += palabra.charAt(posi);
        }
        System.out.println("La palabra invertida es: " +invertida);
    }
}
