
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Headphones", "Accessories")
        };

        int index = SearchAlgorithms.linearSearch(products, "Smartphone");
        System.out.println("Linear Search Result: " + (index >= 0 ? products[index] : "Not Found"));

        index = SearchAlgorithms.binarySearch(products, "Smartphone");
        System.out.println("Binary Search Result: " + (index >= 0 ? products[index] : "Not Found"));
    }
}
