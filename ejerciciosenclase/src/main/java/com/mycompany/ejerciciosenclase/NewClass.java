
package com.mycompany.ejerciciosenclase;
public class NewClass {
    @SuppressWarnings("empty-statement")
    public static void  main (String[] args){
      String nombres[] = new String[5];
        
        nombres[0]= "camilo";
        nombres[1]= "pedro";
        nombres[2]= "juan";
        nombres[3]= "ana";
        nombres[4]= "sara";
        
        //necesitamos 2 vectores.
       
        int numero[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        char letra[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','w','x','y','z'};
        int a= 0;
        String adn = "";      
        
        
        while(a<5 ){
            for (int i = 0; i < nombres[a].length(); i++) {
                for (int j = 0; j < letra.length; j++) {
                    if (nombres[a].charAt(i)==letra[j]) {
                       adn = adn+numero[j];
                    }
                }
            }
            nombres[a]= adn;
            System.out.println(nombres[a]);
            adn="";
            a++;
        }
            
    }
}
    

