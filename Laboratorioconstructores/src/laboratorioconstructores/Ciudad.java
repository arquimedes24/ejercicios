package laboratorioconstructores;
public class Ciudad {
        public String nombre,pais,presidente;
        public int poblacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getPresidente() {
        return presidente;
    }

    public int getPoblacion() {
        return poblacion;
    }
        public Ciudad(){
            String  nombre= this.nombre;
            String pais= this.pais;
            int poblacion = this.poblacion;
            String presidente= this.presidente;
        }

    

    
        
        
    }
    
    

