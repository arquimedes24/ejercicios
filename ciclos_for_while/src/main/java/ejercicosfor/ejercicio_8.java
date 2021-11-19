
package ejercicosfor;


public class ejercicio_8 {
     public static void main(String[]args){
         String palabra= "teorias";
        String opuesto="";
        int perspectiva;
        for(perspectiva = palabra.length()-1;perspectiva>=0;perspectiva--){
            opuesto += palabra.charAt(perspectiva);
        }
        System.out.println("La palabra invertida es: " +opuesto);
        
        
         int opu = 25;
        int secu;
         secu = 0;
        int s=0;
        System.out.println(" La serie es: ");
        while(s<=opu){
            secu =  secu + 11;
            s++;
            System.out.println(secu);
          
         }
     }
}
        
    
         
          
         
     

    

       
