import java.util.Scanner;

public class BinarySearchDemo {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid; // Element found
            else if (arr[mid] < key)
                low = mid + 1; // Search right half
            else
                high = mid - 1; // Search left half
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Sorted array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Input: Element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Perform binary search
        int result = binarySearch(arr, key);

        // Output result
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
