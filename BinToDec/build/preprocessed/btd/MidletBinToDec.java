/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package btd;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author systems
 */
public class MidletBinToDec extends MIDlet implements CommandListener {

    private Display display;
    private Form screen;
    private Command exitCommand, okCommand;
    private StringItem stringItem;
    private TextField textField;

    public MidletBinToDec() {
        screen = new Form("Conversion de Binario a decimal");
        display = Display.getDisplay(this);
        exitCommand = new Command("Salir", Command.EXIT, 1);
        okCommand = new Command("Convertir", Command.OK, 0);
        stringItem = new StringItem("Numero Decimal", "0");
        textField = new TextField("Numero Binario", "0", 10, TextField.NUMERIC);
        screen.append(textField);
        screen.append(stringItem);
        screen.addCommand(okCommand);
        screen.addCommand(exitCommand);
        screen.setCommandListener(this);

    }

    public void startApp() {
        display.setCurrent(screen);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if (c == exitCommand) {
            destroyApp(false);
        }
        if (c == okCommand) {
            int factSigno=1;
            String cad = textField.getString();
            if(!esPositivo()){
                factSigno = -1;
                cad = cad.substring(1);
            }
            if (esBinario(cad)) {
                convertir(cad,factSigno);
            } else {
                stringItem.setText("Numero ingresado no es binario positivo");
            }

        }
    }

    private void convertir(String cadN, int factSigno) {
        int indMax = cadN.length() - 1;
        int n = 0;
        for (int i = 0; i <= indMax; i++) {
            int digito = Integer.parseInt(String.valueOf(cadN.charAt(i)));
            n = n + digito * potencia(2, indMax - i);
        }
        stringItem.setText(String.valueOf(n * factSigno));
    }

    private boolean esPositivo(){
        if(textField.getString().startsWith("-")){
            return false;
        }
        return true;
    }
    
    private boolean esBinario(String cadN) {
        int n = cadN.length();
        for (int i = 0; i <= n - 1; i++) {
            char carD = cadN.charAt(i);
            if (carD != '1' && carD != '0') {
                return false;
            }
        }
        return true;
    }

    private int potencia(int base, int exp) {
        int p = 1;
        if (exp == 0) {
            return 1;
        } else {
            for (int i = 1; i <= exp; i++) {
                p = p * base;
            }
            return p;
        }
    }
}
