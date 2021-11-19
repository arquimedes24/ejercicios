package ejercicio;
public class libro{
 private   String autor;
   private String titulo;
 private   int paginas;
 public libro(){
 
 }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
 
    public void mostrarlibro(){
        System.out.println(" El libro se llama: "+ titulo+ " El autor es: "+ autor +" El total de paginas es: "+ paginas);   }

    public String comparar(libro libro1,libro libro2){
     return libro1.getPaginas()> libro2.getPaginas() ? libro1.getTitulo()+" Tiene mas paginas":libro2.getTitulo()+" Tiene mas paginas";
         
    }  

}