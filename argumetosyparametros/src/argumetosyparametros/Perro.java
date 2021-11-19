package argumetosyparametros;
public class Perro {
    private String nombre,dueño;
    private int edad;
    public static void main(String[] args) {  
        Perro mascota=new Perro("Rocky",1,"Andrea");
        
    }

    public Perro(String nombre, String dueño, int edad) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.edad = edad;
    }
                    //
    public Perro(String nombre,int edad,String dueño){
     this.nombre=nombre;
     this.edad=edad;
     this.dueño=dueño;
    }
}
