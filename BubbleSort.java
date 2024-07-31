import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        // Display original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Perform bubble sort
        bubbleSort(numbers);

        // Display sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
