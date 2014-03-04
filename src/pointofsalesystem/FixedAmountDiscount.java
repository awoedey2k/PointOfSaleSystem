
package pointofsalesystem;

/**
 *
 * @author emazariegos
 */
public class FixedAmountDiscount implements DiscountStrategy {
    
    // Properties
    private double amountDiscount;
    
    // Constructor
    public FixedAmountDiscount(double discount) {
        this.setAmountDiscount(discount);
    }
    
    // Setters
    public void setAmountDiscount(double discount) {
        if(discount == 0.0) {
            throw new IllegalArgumentException("error: amountDiscount must be greater than zero");
        }
       
        this.amountDiscount = discount;
    }
    
    // Getters
    public double getAmountDiscount() {
        return amountDiscount;
    }
    
    // Methods
    @Override
    public double getDiscount(double qty, double price) {
        return (qty * price) - (qty * price - (qty * amountDiscount));
    }
    
    @Override
    public double getAmountAfterDiscount(double qty, double price) {
        return (qty * price) - (qty * amountDiscount); 
    }
    
//    // TEST
//    public static void main(String[] args) {
//        
//        FixedAmountDiscount disc = new FixedAmountDiscount(2); // Parameter passed is the amount of Dollars
//        double discount1 = disc.getDiscount(2, 10);// Qty and Price
//        System.out.println("Discount should be: $4 " + discount1);
//        
//        double discount = disc.getPriceAfterDiscount(2, 10); 
//        System.out.println("After discount price should be: $16 " + discount + "\n");
//        
//    }
    
}
