package argumetosyparametros;
public class Argumetosyparametros {
    private String marca,modelo,color;
    private boolean venta;
    public static void main(String[] args) {
        Argumetosyparametros carro=new Argumetosyparametros("chevrolet"," onix turbo", "blanco",true );
        
    }
    public Argumetosyparametros(String marca,String modelo,String color,boolean venta   ){
    this.marca=marca;
     this.modelo=modelo;
      this.color=color;
       this.venta=venta;
    }
}
