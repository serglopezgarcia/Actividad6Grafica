/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06.pideDatos;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class Pregunta {
    /**
     *Verifies that the input introduced by the user is an integer, if not catch the NumberFormatException or IOException, displays a message, and ask user
     * for another number till the value introduced is an integer number.
     * @param input
     * @return the user's number (integer)
     */
    public static boolean isNumInt(String input) {
        int num = 0;
        
        try {
            num = Integer.parseInt(input);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No has introducido un número!", "Error al introducir las plazas", JOptionPane.WARNING_MESSAGE);
            Toolkit.getDefaultToolkit().beep();//Sound for the error
            return false;
        }     
        return true;
        
    }
    
    /**
     *Verifies that the input introduced by the user is a double, if not catch the NumberFormatException or IOException, displays a message, and ask user
     * for another number till the value introduced is a double number.
     * @param input
     * @return the user's number (double)
     */
    public static boolean isNumDouble(String input) {
        double num = 0;
        
        try {
            num = Double.parseDouble(input);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "No has introducido un número!", "Error al introducir las plazas", JOptionPane.WARNING_MESSAGE);
            Toolkit.getDefaultToolkit().beep();//Sound for the error
            return false;
        }     
        return true;
    }
}
