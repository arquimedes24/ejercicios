package Carro;
public class Ejeclases {
    public int motor;
    private String color;
     String marca="maraca del carro";
      int modelo;
    String velocidad_Maxima;

    public Ejeclases(int motor, String color, int modelo, String velocidad_Maxima) {
        this.motor = motor;
        this.color = color;
        this.modelo = modelo;
        this.velocidad_Maxima = velocidad_Maxima;
    }
    
    
    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getVelocidad_Maxima() {
        return velocidad_Maxima;
       
     
    }

    public void setVelocidad_Maxima(String velocidad_Maxima) {
        this.velocidad_Maxima = velocidad_Maxima;
        
    }
    
    //los métodos son las funcionalidades de la clase
    //setters: asignan valores NO retornan
    public void setColor(String color){
      this.color = color;  
    }
    //getters
    public String getColor(){
        return color;
    }
    public static void main(String []args){
        Ejeclases carro = new Ejeclases(1600,"negro",2020 ,"100k/h");
        System.out.println("");
       // carro.setColor("Negro");
        //System.out.println("El color del vehiculo es:" + carro.getColor());    
           
       // carro.setVelocidad_Maxima("100k/h");
        //System.out.println("La velocidad maxima del vehiculo es:"  + carro.getVelocidad_Maxima());
  
         
         
    
    }
    
}
