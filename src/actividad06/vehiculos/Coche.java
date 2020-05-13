
package actividad06.vehiculos;


/**
 *
 * @author sergionicolaslopezgarcia
 */
public class Coche extends Vehiculo  {

    //Enum with the valid options for the car's gama
    public enum Gama {
        A,
        B,
        C,
        D
    }
    
    private Gama gama;
    
    /**
     *Constructor for Coche.
     * @param licensePlate License plate of the car
     * @param brand brand of the car
     * @param model Model of the car
     * @param numSeats Number of seats of the car
     * @param numberDaysRented Numbers of days the car is rented
     * @param gama gama for the car
     */
    public Coche(String licensePlate, String brand, String model, int numSeats, int numberDaysRented, Gama gama) {
        super(licensePlate, brand, model, numSeats, numberDaysRented);//Call for the constructor of the super class (Vehiculo)
        this.gama = gama;
    }
    
    /**
     *Default Constructor for Coche. Sets the attributes to 0 or "" and gama to null
     */
    public Coche() {
        super();//Call for the default constructor of the super class (Vehiculo)
        this.gama = null;
    }
    
    /**
     *Getter for the car's gama.
     * @return The gama of the car
     */
    public Gama getGama() {
        return this.gama;
    }
    
    /**
     *Setter for the car's gama.
     * @param gama the gama of the car
     */
    public void setGama(Gama gama) {
        this.gama = gama;
    }
    
    @Override
    public void displayInfo(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Getter for the total price of the rental.Override the Interface IVehiculo method
     * @return the total price for the rental of the car
     */
    @Override
    public double getTotalPriceOfRent() {
        return super.getTotalPriceOfRent() + ((super.getNumSeats() + super.getNumberDaysRented()) * 1.5); 
    }
    
    /**
     *Method that sets all the attributes of the car
     * @param plate
     * @param brand
     * @param model
     * @param seats
     * @param days
     * @param gama
     */
    public void askInfo(String plate, String brand, String model, int seats, int days, Gama gama) {
        super.askInfo(plate, brand, model, seats, days);
        this.setGama(gama);
    }
}
