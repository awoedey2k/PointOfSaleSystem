/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pointofsalesystem;

/**
 *
 * @author esvin
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public double getDiscount(double qty, double price) {
        return 0;
    }

    @Override
    public double getAmountAfterDiscount(double qty, double price) {
        return qty * price;
    }
    
}
