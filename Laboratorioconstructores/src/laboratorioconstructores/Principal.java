package laboratorioconstructores;
 public class Principal {
     public static void main(String[] args) {  
        
           Ciudad asd = new Ciudad ();
           asd.setNombre("Girardot");
           asd.setPais("Colombia");
           asd.setPoblacion(1000000);
           asd.setPresidente("Ivan Duque ");
        
        
     
        System.out.println("Ciudad : "+asd.getNombre());
        System.out.println("Pais   : "+asd.getPais()); 
        System.out.println("Poblacion : "+asd.getPoblacion());
        System.out.println("Presidente : "+asd.getPresidente()); 
     }
}
