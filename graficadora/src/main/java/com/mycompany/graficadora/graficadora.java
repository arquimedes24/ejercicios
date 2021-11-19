package com.mycompany.graficadora;
      import org.nfunk.jep.JEP; 
public class graficadora {
    JEP j=new JEP();
    public graficadora(String def ){
        j.addVariable("x",0);
        j.addStandardConstants();
        j.addStanadardFuntions();
        j.parseExpression(def);
        if(j.hasError()){
            System.out.print(j.getErrorInfo());
        }
    }
 public double evaluar ( int x){
       double r ;
       j.addVariable("x",x);
       r=j.getValue();
       if(j.hasError()){
           System.out.print(j.getErrorInfo());           
       }
        return r;
    }
}


