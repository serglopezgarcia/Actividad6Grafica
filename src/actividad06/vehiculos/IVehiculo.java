
package actividad06.vehiculos;

/**
 *
 * @author sergionicolaslopezgarcia
 */
public interface IVehiculo {
    void setNumberDaysRented(int days);
    double getTotalPriceOfRent();
    void displayInfo(String color);
    void askInfo(String plate, String brand, String model, int seats, int days);
    double basePrice = 50;
}
