package ClaseMath;
public class Ejercicio3 {
    public static void main(String[] args) {
        double Nota1= Math.random()*10;
        double Nota2= Math.random()*10;
        double Nota3= Math.random()*10;
        double Nota4= Math.random()*10;
        double Nota5= Math.random()*10;
        double promedio =(Nota1+Nota2+Nota3+Nota4+Nota5)/5;
        System.out.println(Nota1);
        System.out.println(Nota2);
        System.out.println(Nota3);
        System.out.println(Nota4);
        System.out.println(Nota5);
        System.out.println("el promedio es "+promedio);
    }
    
}
