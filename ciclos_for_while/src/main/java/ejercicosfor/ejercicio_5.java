
package ejercicosfor;


public class ejercicio_5 {
    public static void  main (String[] args){
        String palabra = " mariana ";
        String palabrainvertida="";
        for (int l=palabra.length()-1;l>=0;l--){
        palabrainvertida = palabrainvertida + palabra.charAt(l);
        }
        if (palabrainvertida.equals(palabra)) {
            System.out.println(palabrainvertida + " Es palindroma  ");
        } else{
            System.out.println(palabrainvertida+" No es palindroma ");
        }
        
    }
}

