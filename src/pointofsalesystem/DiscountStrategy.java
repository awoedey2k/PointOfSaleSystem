
package pointofsalesystem;

/**
 *
 * @author esvin
 */
public interface DiscountStrategy {

    // Methods
    public abstract double getDiscount(double qty, double price);
    public abstract double getAmountAfterDiscount(double qty, double price);

}
