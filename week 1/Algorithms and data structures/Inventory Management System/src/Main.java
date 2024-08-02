
public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);
        
        inventoryManager.displayProducts();
        
        product1.setQuantity(15);
        inventoryManager.updateProduct(product1);
        
        inventoryManager.displayProducts();
        
        inventoryManager.deleteProduct("P002");
        
        inventoryManager.displayProducts();
    }
}
