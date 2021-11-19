
import org.nfunk.jep.JEP;





public class Funcion {
    
    

        JEP j = new JEP();

        public Funcion(String def) {

            j.addVariable("x", 0);
            j.addStandardConstants();
            j.addStandardFunctions();
            j.parseExpression(def);
            if (j.hasError()) {
                System.out.println(j.getErrorInfo());

            }

        }

        public double eval(double x) {

            double r;
            j.addVariable("x", x);
            r = j.getValue();
            if(j.hasError()){
                System.out.println(j.getErrorInfo());
                
            }
            return r;

        }
    }
    

