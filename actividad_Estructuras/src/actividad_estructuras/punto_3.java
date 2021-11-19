
package actividad_estructuras;

import java.util.Scanner;

public class punto_3 {

    public static void main(String[] args) {
       double positivo=0;
                double acumulado =0;
                double nm150=0;
                int grpn;
                double mayor=0;
                double menor=0;
                double negativo=0;
                double acum=1;
                
                System.out.println("De que cantidad quiere que sea el grupo de numeros");
                
                Scanner entrada = new Scanner (System.in);
                
                grpn = entrada.nextInt();

                
                while(grpn>=acum){
                    System.out.println("Ingrese los numeros "+"("   + acum +" de " +grpn+")");
                    double numero=entrada.nextDouble();
                    acum = acum +1;
                     
                     if(numero >0 )
                        acumulado+=numero;
                     if(numero>0)
                         positivo+=1;
                        
                    if(numero >mayor)
                        mayor=numero;
                    if(numero<menor)
                        menor=numero;
                    if (numero>150)
                                nm150+=1;
                    if (numero<0)
                        negativo+=1;
                    

            }
                double promediop=(acumulado/positivo);
                
                System.out.println("El #mayor numero del grupo ingresado es : "+mayor);
                System.out.println("El #menor numero del grupo ingresado es : " + menor);
                System.out.println("Numeros mayores a 150 : "+ nm150);
                System.out.println("Numeros negativos encontrados : " +negativo);
                System.out.println("Promedio de los numeros positivos : "+promediop);
    }
    
}
