package ejercicio;
public class principal {
    public static void main(String[] args) {
        
        libro nn =new libro();
        nn.setAutor("Gabriel Garcia Marquez");
        nn.setPaginas(300);
        nn.setTitulo("cien años de soledad");
         nn.mostrarlibro();
    
         libro jj =new libro();
        jj.setAutor("calvin");
        jj.setPaginas(250);
        jj.setTitulo("reseta");
         jj.mostrarlibro();
         System.out.println(nn.comparar(nn, jj));
    }
        }

    

