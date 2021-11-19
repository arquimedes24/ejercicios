package GUI;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Carton extends JPanel
{

    public Carton(String nom)
    {
        nombre = nom;
        JPanel p = new JPanel();
        p.setBackground(Color.blue);
        p.setLayout(new GridLayout(6, 5));
        casillas = new JPanel[6][5];
        numeros = new int[5][5];
        colocarPalabraBingo(p);
        Vnumeros = new ArrayList();
        for(int i = 1; i < casillas.length; i++)
        {
            for(int j = 0; j < casillas[0].length; j++)
            {
                int n;
                for(n = 15 * j + (int)(Math.random() * 15D) + 1; Vnumeros.contains(Integer.valueOf(n)); n = 15 * j + (int)(Math.random() * 15D) + 1);
                casillas[i][j] = new JPanel();
                casillas[i][j].setLayout(new BorderLayout());
                if(i == 3 && j == 2)
                {
                    casillas[i][j].add(new JLabel(" "));
                    casillas[i][j].setBorder(new LineBorder(Color.BLACK, 1));
                    numeros[i - 1][j] = 0;
                } else
                {
                    numeros[i - 1][j] = n;
                    JLabel l = new JLabel((new StringBuilder()).append(n).toString());
                    l.setHorizontalAlignment(0);
                    casillas[i][j].add(l);
                    casillas[i][j].setBorder(new LineBorder(Color.BLACK, 1));
                }
                casillas[i][j].setEnabled(false);
                p.add(casillas[i][j]);
                Vnumeros.add(Integer.valueOf(n));
            }

        }

        p.setPreferredSize(new Dimension(150, 150));
        add(p);
        setBackground(Color.ORANGE);
    }

    private void colocarPalabraBingo(JPanel p)
    {
        String v[] = {
            "B", "I", "N", "G", "O"
        };
        for(int i = 0; i < 5; i++)
        {
            casillas[0][i] = new JPanel();
            casillas[0][i].setLayout(new BorderLayout());
            casillas[0][i].setBackground(Color.blue);
            JLabel b = new JLabel(v[i]);
            b.setHorizontalAlignment(0);
            casillas[0][i].setBorder(new LineBorder(Color.blue, 1));
            casillas[0][i].add(b);
            p.add(casillas[0][i]);
        }

    }

    public JPanel[][] getCasillas()
    {
        return casillas;
    }

    public void setCasillas(JPanel casillas[][])
    {
        this.casillas = casillas;
    }

    public int[][] getNumeros()
    {
        return numeros;
    }

    public void setNumeros(int numeros[][])
    {
        this.numeros = numeros;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    JPanel casillas[][];
    int numeros[][];
    ArrayList Vnumeros;
    String nombre;
}
