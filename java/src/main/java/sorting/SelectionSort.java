package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr, int size) {

        for (int i = 0; i < size - 1; i++) {
            int min = i;

            // locate min
            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        
    }
}
