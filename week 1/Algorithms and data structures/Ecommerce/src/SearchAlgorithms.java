
import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    public static int linearSearch(Product[] products, String searchTerm) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }
        return -1; 
    }

    public static int binarySearch(Product[] products, String searchTerm) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = searchTerm.compareToIgnoreCase(products[mid].getProductName());

            if (result == 0) {
                return mid; 
            }

            if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }
}
