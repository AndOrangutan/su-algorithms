package sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int size) {
        int i, j, temp;
        boolean swapped;
        
        for (i = 0; i < size; i++) {
            swapped = false;
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                
            }

            if (swapped == false)
                break;

        }
    }


}
