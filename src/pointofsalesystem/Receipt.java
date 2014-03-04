
package pointofsalesystem;

/**
 *
 * @author esvin
 */
public class Receipt {

    // Properties
    private LineItem[] lineItems;

    // Constructor
    public Receipt() {
        lineItems = new LineItem[1];
    }
    
    public LineItem createLineItem(String itemId, double qty) {
        lineItems[0].findLineItemProduct(itemId);
        lineItems[0].generateLineItem(qty);
        return lineItems[0];
    }

    private void addToArray(final LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    
    public static void main(String[] args) {
        
        Receipt receipt1 = new Receipt();
        receipt1.addToArray(receipt1.createLineItem("135792", 1));

//        Receipt receipt1 = new Receipt();
//        receipt1.createLineItem("135792", 1);
//        receipt1.createLineItem("234567", 3);

    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

}
