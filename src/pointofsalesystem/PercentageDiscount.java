
package pointofsalesystem;

import java.text.DecimalFormat;

/**
 *
 * @author Esvin J Mazariegos
 */
public class PercentageDiscount implements DiscountStrategy {
    DecimalFormat formatter = new DecimalFormat("#,##0.00");
    // Properties
    private double percentRate  = .10;
    
    // Constructor
    public PercentageDiscount(final double percent) {
        this.setPercentRate(percent);
    }
    
    // Setters
    public void setPercentRate(final double percent) {
        percentRate = percent;
    }
    
    // Getters
    public double getPercentRate() {
        return percentRate;
    }
    
    // Methods
    @Override
    public double getDiscount(double qty, double price) {
        return (qty * price * percentRate);
    }
    
    @Override
    public double getAmountAfterDiscount(double qty, double price) {
        return (qty * price) - getDiscount(qty, price);
    }
    
    
    
//    // TEST
//    public static void main(String[] args) {
//        DecimalFormat formatter = new DecimalFormat("#,##0.00");
//        
//        PercentageDiscount disc = new PercentageDiscount(.10);
//        double discount = disc.getDiscount(2, 9.97);
//        System.out.println("Discount should be : $2 " + formatter.format(discount ));
//        
//        double discount1 = disc.getTotalAfterDiscount(2, 9.97);
//        System.out.println("Price after discount should be $18 " + formatter.format(discount1));
//        
//    }
//    
}
