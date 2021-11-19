package triki;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class modo_tex_calc {

    public class Sumar2num extends JFrame implements ActionListener {

        JLabel texto1, texto2, resultado;
        JTextField num1, num2;
        JButton sumar, salir, restar;

        public static void main(String[] args) {
            Sumar2num ventana1 = new Sumar2num();
            ventana1.setBounds(500, 300, 700, 400);
            //ventana1.setSize(300,400);
            ventana1.setVisible(true);
        }

        public Sumar2num() {
            setLayout(null); // para yo darle las coordenadas 

            texto1 = new JLabel("Numero 1:");
            texto1.setBounds(100, 50, 150, 20);
            texto1.setBackground(Color.red);
            add(texto1);

            num1 = new JTextField();
            num1.setBounds(300, 50, 100, 20);
            add(num1);

            texto2 = new JLabel("Numero 2:");
            texto2.setBounds(100, 100, 150, 20);
            texto2.setBackground(Color.red);
            add(texto2);

            num2 = new JTextField();
            num2.setBounds(300, 100, 100, 20);
            add(num2);

            sumar = new JButton("Sumar");
            sumar.setBounds(500, 50, 100, 20);
            add(sumar);
            sumar.addActionListener(this);

            restar = new JButton("Restar");
            restar.setBounds(500, 80, 100, 20);
            add(restar);
            restar.addActionListener(this);

            salir = new JButton("Salir");
            salir.setBounds(500, 120, 100, 20);
            add(salir);

            salir.addActionListener( //agregacion de un proceso a la opcion salir del boton salir
                    new ActionListener() {
                public void actionPerformed(ActionEvent evento) {
                    System.exit(0);
                }
            }
            );

            resultado = new JLabel("Resultado:");
            resultado.setBounds(100, 200, 150, 20);
            resultado.setBackground(Color.red);
            add(resultado);

            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        }

        public void actionPerformed(ActionEvent e) {
            int a, b, c;
            if (e.getSource() == sumar || e.getSource() == restar) {
                try {
                    a = Integer.parseInt(num1.getText());
                    b = Integer.parseInt(num2.getText());
                    if (e.getSource() == sumar) {
                        c = a + b;
                        resultado.setText("La suma es " + c);
                    }
                    if (e.getSource() == restar) {
                        c = a - b;
                        resultado.setText("La resta es " + c);
                    }
                } catch (Exception err) {
                    resultado.setText("Error de entrada");
                }
            }
        }

        private void add(JButton salir) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}


