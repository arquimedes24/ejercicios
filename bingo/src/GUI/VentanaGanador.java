
package GUI;

import java.awt.Color;
import javax.swing.*;

public class VentanaGanador extends JFrame
{

    public VentanaGanador(Carton c)
    {
        panelPrincipal = (JPanel)getContentPane();
        pg = new panelGanador();
        panelPrincipal.add(pg);
        JLabel l = new JLabel((new StringBuilder("El Ganador fue el Jugador numero ")).append(c.getNombre()).toString());
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        panel1.add("Center", l);
        panelPrincipal.add(panel1, "South");
        panelPrincipal.setBackground(Color.blue);
        setVisible(true);
        setBounds(0, 0, 400, 200);
    }

    panelGanador pg;
    JPanel panelPrincipal;
}
