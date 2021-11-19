package agendatelefonica;
public class Principal {
 public static void main(String[] args) {
     agendaTelefonica agenda = new agendaTelefonica();
        contacto contac= new contacto();
        
        contac.setNombre("juan ");
        contac.setNumtel( 321245059 );
        
      System.out.println(" Agregar contacto ");
        agenda.reguistrarcontacto(contac);
        
        contac.setNombre("ana ");
        contac.setNumtel( 321225059 );
        
      System.out.println(" Agregar contacto ");
        agenda.reguistrarcontacto(contac);
        
        System.out.println("Listar agenda");
        agenda.listarcontacto();
        
    }
    
}
