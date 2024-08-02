
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 100.00),
            new Order("O003", "Charlie", 450.75)
        };

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("Orders sorted using Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Resetting orders array for Quick Sort
        orders = new Order[] {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 100.00),
            new Order("O003", "Charlie", 450.75)
        };

        // Quick Sort
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted using Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
