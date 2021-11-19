package ClaseVarios;

import javax.swing.JOptionPane;

public class Varios {

    public double leerEntero(String msg) {

        double n = 0;

        while (true) {
            try {
                n = Double.parseDouble(JOptionPane.showInputDialog(msg));
                break;
            } catch (Exception e) {
                Mensaje("debe ser decimal");
            }
        }
        return n;
    }

    public String LeerCadena(String msg) {
        String n;
        while (true) {

            n = JOptionPane.showInputDialog(msg);
            if (n.equals("")) {
                Mensaje("Campo vacio");
            } else {
                break;
            }

           
        }
         return n;
    }

    
    public char leerCaracter(String msg) {
        char n;
        while (true) {

            String m = JOptionPane.showInputDialog(null, msg);
            n = m.charAt(0);

            if (n == ' ') {
                Mensaje("campo vacio");
            } else {
                break;
            }
        }
 
        return n;
    }

    public void Mensaje(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    double leerDecimal(String ingrese_el_numero_decimal_) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    int leerENtero(String numero_a_buscar_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
