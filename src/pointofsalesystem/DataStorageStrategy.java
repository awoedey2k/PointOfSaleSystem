
package pointofsalesystem;

/**
 *
 * @author esvin
 */
public interface DataStorageStrategy {
    
    // Methods
    public abstract Product findProduct(String itemId);
    public abstract void retrieveProduct(double qty);
    
}
