package TALLER2;
import java.util.Scanner;
public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("digite el valor de la prenda");
        int valor=leer.nextInt();
        if (valor>25000) {
            int precio=(valor*17)/100;
            int dscto= valor-precio;
            System.out.println("el descuento que se le hará es del 17%, el descuento será de " + precio + " el precio total es " + dscto);    
        }else{
            int precio=(valor*5)/100;
            int dscto=valor-precio;
            System.out.println("el descuento que se le hará es del 5%, el descuento será de " + precio + " el precio total es " + dscto);
        }
    }
    
}
