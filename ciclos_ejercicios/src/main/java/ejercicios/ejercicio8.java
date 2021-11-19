package ejercicios;
public class ejercicio8 {
    public static void main(String[]args){
         String texto="ana tiene una pareja de amigos que viven en otro pais ellos le dicen que por que no se toma unas vacaciones y viaja a donde ellos.";
        String vocales="aeiou";
        int s[]={0,0,0,0,0};
        for (int w=0;w<texto.length();w++){
            for (int q=0;q<vocales.length();q++ ){
                if (texto.charAt(w)==vocales.charAt(q)){
                s[q]++;
                }
            }
        }
            for (int w=0;w<vocales.length();w++){
                System.out.println("Aparece la letra "+ vocales.charAt(w)+"; "+s[w]+" veces ");
            }
            
             String palabra = "ana";
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
