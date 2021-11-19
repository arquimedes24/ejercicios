package argumetosyparametros;
public class Calculadora {
    public static void main(String[] args) {
        //clase         objeto 
        Calculadora calculadora=new Calculadora();
        int numeros[]={6 ,8 ,5 ,4 ,1};
        int Resultado=calculadora.sumarVectores(numeros);
        System.out.println(Resultado);
    }
    public int  sumar(int numero1,int numero2){
       return numero1+numero2;
     }
    public int sumarVectores(int numeros[]){
    int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            suma=suma+numeros[i];
        }
        return suma;
    }
}
