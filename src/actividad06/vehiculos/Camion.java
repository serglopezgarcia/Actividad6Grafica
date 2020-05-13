
package actividad06.vehiculos;


/**
 * @author sergionicolaslopezgarcia
 */
public class Camion extends Carga {
    //Enum with the valid options for the truck's structure
    public enum Structure {
        RIGIDO,
        REMOLQUE,
        SEMIRREMOLQUE
    }
    
    private Structure structure;
    
    /**
     *Constructor for Camion.
     * @param licensePlate License plate of the carga vehicule
     * @param brand the brand of the truck
     * @param model Model of the carga vehicule
     * @param numSeats Number of seats of the carga vehicule
     * @param numberDaysRented Numbers of days the carga vehicule is rented
     * @param pMa Max weigth permitted
     * @param structure structure of the truck
     */
    public Camion(String licensePlate, String brand, String model, int numSeats, int numberDaysRented, double pMa, Structure structure) {
        super(licensePlate, brand, model, numSeats, numberDaysRented, pMa);
        this.structure = structure;
    }
    
    /**
     *Default Constructor for Carga. Sets the attributes to 0 or "", and structure to null 
     */
    public Camion() {
        super();
        this.structure = null;
    }
    
    /**
     *Getter for the truck's structure
     * @return The structure of the truck
     */
    public Structure getStructure() {
        return this.structure;
    }
    
    /**
     *Setter for the truck's structure
     * @param structure The structure of the truck
     */
    public void setStructure(Structure structure) {
        this.structure = structure;
    }
    
    /**
     *Getter for the total price of the rental.
     * @return the total price for the rental of the truck
     */
    @Override
    public double getTotalPriceOfRent() {
        return super.getTotalPriceOfRent() + 40; 
    }
    
    /**
     *Method to set all the attributes of the truck
     * @param plate
     * @param brand
     * @param model
     * @param seats
     * @param days
     * @param weight
     * @param structure
     */
    public void askInfo(String plate, String brand, String model, int seats, int days, double weight, Structure structure) {
        super.askInfo(plate, brand, model, seats, days, weight);
        this.setStructure(structure);
    }
}
