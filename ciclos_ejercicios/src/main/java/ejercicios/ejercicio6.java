package ejercicios;
public class ejercicio6 {
    public static void  main (String[] args){
        String texto="Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum";
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
    }
}
