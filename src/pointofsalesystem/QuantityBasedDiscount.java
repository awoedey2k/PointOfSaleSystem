
package pointofsalesystem;

/**
 *
 * @author emazariegos
 */
public class QuantityBasedDiscount implements DiscountStrategy {
    
    // Properties
    private double minQty = 3;
    
    // Constructor
    
    // Methods
    @Override
    public double getDiscount(double qty, double price) {
        double discount = 0;
        if(qty >= minQty){
            discount = (int)(qty / minQty) * price;
        }
        
        return discount;
    }
    
    @Override
    public double getAmountAfterDiscount(double qty, double price) {
        return (qty * price) - getDiscount(qty, price);
    }
    
//    // TEST 
//    public static void main(String[] args) {
//        
//        QuantityBasedDiscount disc = new QuantityBasedDiscount();
//        double discount =  disc.getDiscount(1, 10);
//        System.out.println("Discount should be $0 " + discount);
//        
//        double discount1 = disc.getPriceAfterDiscount(1, 10);
//        System.out.println("Price after Discount should be $10 " + discount1);
//        
//    }
//    
}
