
package pointofsalesystem;

import java.text.DecimalFormat;

/**
 *
 * @author esvin
 */
public class FakeDatabase implements DataStorageStrategy {
    
    //private DecimalFormat formatter = new DecimalFormat("#,##0.00");
    
    // Properties
    private Product product;
    
    private Product[] products = 
    {new Product("234567", "Brewers Shirt", 14.95, new PercentageDiscount(.15)),
     new Product("987654", "Shoes", 23.45, new QuantityBasedDiscount()),
     new Product("135792", "Watch", 121.99, new NoDiscount()),
     new Product("556728", "Socks", 3.95, new FixedAmountDiscount(1.25))};
    
    // Methods
    @Override
    public Product findProduct(String itemId) {
        for(Product p: products){
            if(itemId.equals(p.getItemId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
    
    //??
    @Override
    public final void retrieveProduct(double qty) {
        System.out.print(product.getItemId());
        System.out.print("   " + product.getDescription());
        System.out.print("   " + product.getPrice());
        product.generateDiscount(qty);
        product.generateAmountAfterDiscount(qty);
        
    }
    
//    public static void main(String[] args) {
//        
//        DataStorageStrategy data = new FakeDatabase();
//        data.findProduct("135792");
//        data.retrieveProduct(3);
//        System.out.println("");
//        
//        
//        
//    }
    
}
