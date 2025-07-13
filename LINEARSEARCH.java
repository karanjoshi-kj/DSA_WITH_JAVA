
import java.util.Scanner;

public class LINEARSEARCH {

    // Linear search function
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Return -1 if element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Taking input for the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Calling linearSearch function
        int result = linearSearch(arr, target);

        // Displaying the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
