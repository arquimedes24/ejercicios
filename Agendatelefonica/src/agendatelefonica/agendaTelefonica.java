package agendatelefonica;
public class agendaTelefonica {
   private contacto agenda[]=new contacto[10];
    int contador=0;
   public void reguistrarcontacto(contacto contacto){
       
     for(int i=0 ; i < agenda.length;i++){
            if(agenda[i]==null){
                agenda[i]=contacto;
                contador++;
                break;
            }
     }
       System.out.println("Se agrego el contacto :"+ agenda[contador-1].nombre+
               "con el numero :"+agenda[contador-1].numtel+" en la posiscion "+(contador-1));
      
     }
   
   public void listarcontacto(){
     for (int f = 0; f < agenda.length && agenda[f] != null; f++){
            System.out.println(f);   
         System.out.println(" Nombre: "+ agenda[f].nombre +" Numero: "+ agenda[f].numtel);
        }
    }
   public void buscarcontacto(){
   
   }
   public void disponibles(){
       
       System.out.println();
   }


}

