
package actividadciclos_punto1;

import java.util.Scanner;

public class Punto2 {
        public static void main(String[] args) {
            double notas=0;
            int ne; 
            int reprobado=0;
            int aprobado=0;
            double acum=1;
            System.out.println("Ingrese el numero de estudiantes que cursan Ing sistemas");
            
            Scanner entrada = new Scanner(System.in);
            
            ne= entrada.nextInt();
            
            
                    while(ne>=acum){
                        System.out.println("Ingrese la identificacion del estudiante " + acum);
                        
                        double id=entrada.nextDouble();
                        
                        System.out.println("Ingrese el nombre del estudiante " +acum);
                        
                        String nm=entrada.next();
                        
                        
                        System.out.println("Ingrese la nota definitiva del estudiante "+acum);
                        double nt = entrada.nextDouble();
                        
                        
                        acum=acum+1;
                        


                        
                        
                        if  (nt < 3.0){
                            
                            reprobado +=1;
                            
                        }else{
                            aprobado +=1;
                        }
                        notas += nt;
                    }


                    double promedio=(notas/ne);

                    System.out.println("");
                    System.out.println("La cantidad de alumnos que reprobaron son : "+reprobado);
                    System.out.println("La cantidad de alumnos que aprobaron son : "+aprobado);
                    System.out.println("El promedio del curso en el semestre es de : " +promedio);
                    }
   
            
            
        }


    
    
    
    

