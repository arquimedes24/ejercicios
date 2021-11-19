import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class picasyfijas {

  public static final Random RANDOM = new Random();
  private int num;
  private int nbGuesses;
  private boolean guessed;
  private JTextPane textPane;
  private JTextField textField;

  // we generate a number
  private void generar_Numero() {
    do {
      num = RANDOM.nextInt(9000) + 1000;
    } while ( hasDuplicates ( num ));

    System.out.println("[numero] = " + num + "\n");
  }

  private boolean hasDuplicates(int number) {
    boolean[] digits = new boolean[10];

    while (number > 0) {
      int last = number % 10;

      if (digits[last]) return true;

      digits[last] = true;
      number = number / 10;
    }

    return false;
  }

  // return the number of bulls and cows for the entered number comparing to the number to guess
  private int[]picasyFijas(int entered) {
    int picas = 0;
    int fijas = 0;

    String enteredStr = String.valueOf(entered);
    String numberStr = String.valueOf(num);

    for (int i = 0; i < numberStr.length(); i++) {
      char c = enteredStr.charAt(i);

      if (c == numberStr.charAt(i)) {
        picas++;
      } else if (numberStr.contains(String.valueOf(c))) {
        fijas++;
      }
    }

    return new int[] {picas,fijas};
  }

  private void jugar() {
    // Create and set up the window.
    JFrame frame = new JFrame("Picas y fijas ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    // add buttons
    JPanel buttonsPanel = new JPanel();

    JLabel inputLabel = new JLabel("Digite 4 numeros :");
    buttonsPanel.add(inputLabel, BorderLayout.LINE_START);

    textField = new JTextField(15);
    textField.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        okClick();
      }
    });
    buttonsPanel.add(textField, BorderLayout.LINE_START);

    JButton okButton = new JButton("Jugar");
    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        okClick();
      }
    });

    buttonsPanel.add(okButton, BorderLayout.LINE_END);

    JButton newGameButton = new JButton("juego nuevo");
    
    newGameButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        init();
      }
    });

    buttonsPanel.add(newGameButton, BorderLayout.LINE_END);
    contentPane.add(buttonsPanel, BorderLayout.PAGE_END);

    // add text area
    textPane = new JTextPane();
    textPane.setEditable(false);
    JScrollPane jscrollpane = new JScrollPane(textPane);

    SimpleAttributeSet bSet = new SimpleAttributeSet();
    StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_CENTER);
    StyleConstants.setFontSize(bSet, 20);
    StyledDocument doc = textPane.getStyledDocument();
    doc.setParagraphAttributes(0, doc.getLength(), bSet, false);

    contentPane.add(jscrollpane, BorderLayout.CENTER);
    frame.setMinimumSize(new Dimension(300, 400));

    // center jframe
    Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
    int iCoordX = (objDimension.width - frame.getWidth()) / 2;
    int iCoordY = (objDimension.height - frame.getHeight()) / 2;
    frame.setLocation(iCoordX, iCoordY);

    // Display the window.
    frame.pack();
    frame.setVisible(true);

    init();
  }

  private void okClick() {
    String userInput = textField.getText();
    int entered = -1;

    try {
      entered = Integer.parseInt(userInput);
    } catch(Exception e) {
      textField.setText("");
      JOptionPane.showMessageDialog(null, "Debe ingresar un numero", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }

    if (hasDuplicates(entered) || entered < 1000 || entered > 9999) {
      textField.setText("");
      JOptionPane.showMessageDialog(null, "debe ingresar un número de 4 digitos sin repetirlo", "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }

    nbGuesses++;

    int[] respu = picasyFijas(entered);

    if (respu[0] == 4) {
      guessed = true;
    } else {
      updateText(entered + "\t\t\t\t" + respu[0] + " picas y " + respu[1] + " fijas");
    }

    if (guessed) {
      updateText("\n" + entered + "\n\n Correcto lo adivinaste en el  " + nbGuesses + " adivinaste");
    }

    textField.setText("");
     
  }

  private void updateText(String txt) {
    textPane.setText(textPane.getText() + "\n" + txt);
 
  }

  private void init() {
    generar_Numero();
    nbGuesses = 0;
    guessed = false;
    textPane.setText(" Al obtener 4 fijas habrás ganado el juego");
    textField.setText("");
  }

  public static void main(String[] args) {
    picasyfijas juegoFinal = new picasyfijas();

    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        juegoFinal.jugar();
      }
    });
  }

}