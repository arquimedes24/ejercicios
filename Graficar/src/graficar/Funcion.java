/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficar;


import org.nfunk.jep.JEP;
public class Funcion {
    JEP j=new JEP();
    public Funcion(String def ){
        j.addVariable("x",0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        if(j.hasError()){
            System.out.print(j.getErrorInfo());
        }
    }
 public double evaluar ( double  x){
       double r ;
       j.addVariable("x",x);
       r=j.getValue();
       if(j.hasError()){
           System.out.print(j.getErrorInfo());           
       }
        return r;
    }
}

