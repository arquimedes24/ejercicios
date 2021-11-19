package ClaseVarios;

public class Valida_Varios {

    public static void main(String[] args) {
        Varios v = new Varios();;
        v.Mensaje("hola mundo");
        int a = (int) v.leerEntero("ingrese el numero entero: ");
        v.Mensaje("numero leido"+a);
        
        
       double b = v.leerDecimal("ingrese el numero decimal: ");
        v.Mensaje("numero leido" + b);
        
        v.LeerCadena("ingrese nombre");
        
        v.LeerCadena("ingrese caracter");
    }    
}
