
package pointofsalesystem;

/**
 *
 * @author esvin
 */
public class LineItem {
    
    // Properties
    private DataStorageStrategy dataStorage;
    
    
    
    // Constructor
    public LineItem(DataStorageStrategy dataStorage) {
        this.setDataStorage(dataStorage);
    }
    
    
    // Setters
    public void setDataStorage(DataStorageStrategy dataStorage) {
        this.dataStorage = dataStorage;
    }
    
    // Getters
    public DataStorageStrategy getDataStorage() {
        return dataStorage;
    }
    
    
    // Methods
    public void findLineItemProduct(String itemId) {
        dataStorage.findProduct(itemId);
    }
    
    public void generateLineItem(double qty) {
        dataStorage.retrieveProduct(qty);
    }
    
    
//    // TEST
//    public static void main(String[] args) {
//        
//        LineItem item1 = new LineItem(new FakeDatabase());
//        item1.findLineItemProduct("135792");
//        item1.generateLineItem(1);
//        
//    }
//    
}
