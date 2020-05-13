
package actividad06.vehiculos;



/**
 *
 * @author sergionicolaslopezgarcia
 */
public abstract class Vehiculo implements IVehiculo {
    private String licensePlate;
    private String brand;
    private String model;
    private int numSeats;
    private int numberDaysRented;
    
    /**
     *Constructor for Vehicule.
     * @param licensePlate License plate of the car
     * @param brand the brand of the vehicule
     * @param model Model of the car
     * @param numSeats Number of seats of the car
     * @param numberDaysRented Numbers of days the car is rented
     */
    public Vehiculo(String licensePlate, String brand, String model, int numSeats, int numberDaysRented) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.numSeats = numSeats;
        this.numberDaysRented = numberDaysRented;
    }
    
    /**
     *Default Constructor for Vehicule. Sets the attributes to 0 or ""
     */
    public Vehiculo() {
        this.licensePlate = "";
        this.brand = "";
        this.model = "";
        this.numSeats = 0;
        this.numberDaysRented = 0;
    }
    
    /**
     *Getter for the vehicule's license plate.
     * @return The license plate of the vehicule
     */
    public String getLicense() {
        return licensePlate;
    }
    
    /**
     *Setter for the vehicule's license.
     * @param license Value to be assign in licensePlate
     */
    public void setLicense(String license) {
        this.licensePlate = license;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    /**
     *Getter for the vehicule's model.
     * @return The model of the vehicule
     */
    public String getModel() {
        return model;
    }
    
    /**
     *Setter for the vehicule's model.
     * @param model Value to be assign in model
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    /**
     *Getter for the vehicule's number of seats.
     * @return The number of seats of the vehicule
     */
    public int getNumSeats() {
        return numSeats;
    }
    
    /**
     *Setter for the vehicule's number of seats.
     * @param numSeats Value to be assign in numSeats
     */
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    
    /**
     *Getter for the number of days the car is rented.
     * @return The days of the rental
     */
    public int getNumberDaysRented() {
        return this.numberDaysRented;
    }
    
     /**
     *Setter for the number of days the car is rented. Override the Interface IVehiculo method
     * @param days Value of days to be store
     */
    @Override
    public void setNumberDaysRented(int days) {
        this.numberDaysRented = days;    
    }
    
    /**
     *Getter for the total price of the rental.Override the Interface IVehiculo method
     * @return the total price for the rental of the car
     */
    @Override
    public double getTotalPriceOfRent() {
        return (IVehiculo.basePrice * this.numberDaysRented); 
    }
    
    
    /**
     *Method to set all the attributes of Vehicule .Override the Interface IVehiculo method
     * @param plate
     * @param brand
     * @param model
     * @param seats
     * @param days
     */
    @Override
    public void askInfo(String plate, String brand, String model, int seats, int days) {
        this.setLicense(plate);
        this.setBrand(brand);
        this.setModel(model);
        this.setNumSeats(seats);
        this.setNumberDaysRented(days);
    }   
    
    
}

    