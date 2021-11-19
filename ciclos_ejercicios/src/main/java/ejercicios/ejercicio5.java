
package ejercicios;
public class ejercicio5 {
    public static void  main (String[] args){
        String palabra = " murcielago ";
        String palabrainvertida="";
        for (int a=palabra.length()-1;a>=0;a--){
        palabrainvertida = palabrainvertida + palabra.charAt(a);
        }
        if (palabrainvertida.equals(palabra)) {
            System.out.println(palabrainvertida + " Es palindroma  ");
        } else{
            System.out.println(palabrainvertida+" No es palindroma ");
        }
        
    }
}
