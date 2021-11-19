package TALLER2;
import java.util.Scanner;
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Digite las dimensiones de la figura: altura lado A");
        double valorA=leer.nextDouble();
        System.out.println("Digite la base, lado B");
        double valorB= leer.nextDouble();
        System.out.println("Digite la altura del lado C");
        double valorC=leer.nextDouble();
        double Catetotriangulo=valorA-valorC;
        double areatriangulo=(Catetotriangulo*valorB)/2;
        double arearectangulo=valorB*valorC;
        double AreaTotal=areatriangulo+arearectangulo;
        System.out.println("El area total de la figura es " + AreaTotal);
    }
    
}
