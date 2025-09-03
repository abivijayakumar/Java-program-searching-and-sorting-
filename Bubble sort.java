public class SimpleBubbleBinary {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30}; // Unsorted array
        int key = 30; // Element to search

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Binary Search
        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found!");
        }
    }
}