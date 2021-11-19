package ejemplo_try_cathc;

import java.util.Scanner;

public class Ejemplo_try_cathc {
    public static void main(String[] args) {
        String a,b;
        int c;
        Scanner x=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        a = x.next();
        System.out.println("Digite un numero :");
        b = x.next();
      
        try{
            c = Integer.parseInt(a)+Integer.parseInt(b);
            System.out.println("resultado "+c);     
        }catch(Exception e){
            System.out.println("Error "+e);
        
        }
    }
}

    