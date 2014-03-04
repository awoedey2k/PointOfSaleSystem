/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pointofsalesystem;

import java.text.DecimalFormat;

/**
 *
 * @author esvin
 */
public class Product {
    private DecimalFormat formatter = new DecimalFormat("#,##0.00");
    
    // Properties
    private double price;
    private String description;
    private String itemId;
    private DiscountStrategy discountStrategy;
    
    // Constructor
    public Product(final String id, final String description, 
                                   final double price, final DiscountStrategy discountStrategy) {
        this.setItemId(id);
        this.setDescription(description);
        this.setPrice(price);
        this.setDiscountStrategy(discountStrategy);
    }
    
    // Methods
    public void setItemId(final String id) {
        this.itemId = id;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setPrice(final double price) {
        this.price = price;
    }
    
    public void setDiscountStrategy(final DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    //
    public String getItemId() {
        return itemId;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return price;
    }
    
    public DiscountStrategy discountStrategy() {
        return discountStrategy;
    }
    
    //////
    public void generateDiscount(final double qty) {
        double discount = discountStrategy.getDiscount(qty, price);
        System.out.print("   " + formatter.format(discount));
    }
    
    public void generateAmountAfterDiscount(final double qty) {
        double amount = discountStrategy.getAmountAfterDiscount(qty, price);
        System.out.print("   " + formatter.format(amount) + "\n");
    }
    
}
