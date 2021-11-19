
package ejercicosfor;

public class ejercicio6 {
    public static void  main (String[] args){
        String texto="Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum";
        String vocales="aeiou";
        int k[]={0,0,0,0,0};
        for (int t=0;t<texto.length();t++){
            for (int f=0;f<vocales.length();f++ ){
                if (texto.charAt(t)==vocales.charAt(f)){
                k[f]++;
                }
            }
        }
            for (int w=0;w<vocales.length();w++){
                System.out.println("Aparece la letra "+ vocales.charAt(w)+"; "+k[w]+" veces ");
            }
    }
}
