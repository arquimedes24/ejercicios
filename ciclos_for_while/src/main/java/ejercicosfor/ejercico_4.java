
package ejercicosfor;


public class ejercico_4 {
     public static void main(String[]args){
        String palabra= "programacion";
        String opuesto="";
        int perspectiva;
        for(perspectiva = palabra.length()-1;perspectiva>=0;perspectiva--){
            opuesto += palabra.charAt(perspectiva);
        }
        System.out.println("La palabra invertida es: " +opuesto);
    }
}

