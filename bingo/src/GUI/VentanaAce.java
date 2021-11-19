
package GUI;

import java.awt.Font;
import static java.awt.SystemColor.window;
import javax.swing.*;

public class VentanaAce extends JFrame
{

    public VentanaAce()
    {
        panelPrincipal = (JPanel)getContentPane();
        JPanel panelTitulo = new JPanel();
        JLabel titulo = new JLabel("Creadores");
        titulo.setFont(new Font("Verdana", 1, 14));
        panelTitulo.add(titulo);
        JPanel panelnombres = new JPanel();
        JLabel nombres = new JLabel("Santiago Alape y Arquimedes Esguerra");
        panelnombres.add(nombres);
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, 1));
        panelPrincipal.add(panelTitulo);
        panelPrincipal.add(panelnombres);
        setVisible(true);
      setBounds(100,200,300,300);
       setLocationRelativeTo(null);
    }

    JPanel panelPrincipal;
}
