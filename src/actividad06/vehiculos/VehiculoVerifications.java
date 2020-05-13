
package actividad06.vehiculos;

import static actividad06.graphics.VehiculesMain.vehiculeList;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public class VehiculoVerifications {
    
    /**
    * Method that checks if the license plate is valid
     * @param input The license to check
    * @return true if it is valid - else returns false
    */
    public static boolean validPlateAsk(String input) {
        if(!input.toUpperCase().matches("^[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}$")) {//License plata needs to have 4 numbers and 3 letters(CONSONANTS)
            if(input.equals("") || input.equals(" ")) {//Enters if the input is blank or empty
                JOptionPane.showMessageDialog(null, "No has introducido nada!", "Error al introducir la matrícula", JOptionPane.WARNING_MESSAGE);
                Toolkit.getDefaultToolkit().beep();//Sound for the error
                return false;
            } else {//Enters if the format is not valid
                JOptionPane.showMessageDialog(null, "Has introducido una matricula inválida!", "Error al introducir la matrícula", JOptionPane.WARNING_MESSAGE);
                Toolkit.getDefaultToolkit().beep();//Sound for the error
                return false;
            }
        } 
        for(IVehiculo item : vehiculeList) {
            Vehiculo vehicule = (Vehiculo) item;
            if(vehicule != null && vehicule.getLicense().equalsIgnoreCase(input)) {//Checks if the license is not registered
                JOptionPane.showMessageDialog(null, "Esta matricula ya se encuentra registrada!", "Error al introducir la matrícula", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        
        return true;
    }
    
    /**
    * Method that checks the number of seats is valid (between 2-7)
     * @param input the number of seats to check
    * @return true if it is valid, else return false
    */
    public static boolean validSeatsAsk(int input) {
        
        if(input < 2 || input > 7) {
            JOptionPane.showMessageDialog(null, "Has introducido una cantidad inválida de plazas!", "Error al introducir las plazas", JOptionPane.WARNING_MESSAGE);
            Toolkit.getDefaultToolkit().beep();//Sound for the error
            return false;
        } 
        return true;
    }
    
    /**
    * Method that checks if the number of days is valid (more than 0)
     * @param input the number of days to check
     * @return true if it is valid, else return false
    */
    public static boolean validDaysAsk(int input) {
        if(input <= 0) {
            JOptionPane.showMessageDialog(null, "Has introducido una cantidad inválida de días!", "Error al introducir los días de Alquiler", JOptionPane.WARNING_MESSAGE);
            Toolkit.getDefaultToolkit().beep();//Sound for the error
            return false;
        } 
        return true;
    }
    
    /**
    * Method that checks if the Max weight is valid (0-30)
     * @param input the weight to check
    * @return true if it is valid, else return false
    */
    public static boolean validPMAAsk(double input) {
        if(input <= 0 || input > 30) {
            JOptionPane.showMessageDialog(null, "Has introducido un peso inválido!", "Error al introducir el peso máximo", JOptionPane.WARNING_MESSAGE);
            Toolkit.getDefaultToolkit().beep();//Sound for the error
            return false;
        } 
        return true;
    }
    
    /**
    * Method that iterates through the list of vehicules to check if there are vehicules or not
    * @return true if the list is empty or false if there is at least one vehicule in the list 
    */
    public static boolean noVehicules() {
        boolean empty = true;
        for(int i = 1; i < actividad06.graphics.VehiculesMain.vehiculeList.length; i++) {
            if(vehiculeList[i] != null) {
                empty = false;
            }
        }
        return empty;
    }
    
    /**
    * Method that iterates through the list of vehicules to check if the parking is full
    * @return true if the parking is full, else returns false 
    */
    public static boolean parkingFull() {
        int counter = 0;
        for(int i = 1; i < actividad06.graphics.VehiculesMain.vehiculeList.length; i++) {
            if(vehiculeList[i] != null) {
                counter += 1;
            } 
        }
        return (counter == 4);
    }
}
