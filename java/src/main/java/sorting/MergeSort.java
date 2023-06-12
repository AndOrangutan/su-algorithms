package sorting;

public class MergeSort {
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int sizeLeft = m - l + 1;
        int sizeRight = r - m;
 
        // Create temp arrays
        int left[] = new int[sizeLeft];
        int right[] = new int[sizeRight];
 
        // Copy data to temp arrays
        for (int i = 0; i < sizeLeft; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < sizeRight; ++j)
            right[j] = arr[m + 1 + j];
 
        // Merge the temp arrays
 
        int i = 0, j = 0;
 
        int k = l;

        while (i < sizeLeft && j < sizeRight) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
 
        while (i < sizeLeft) {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        while (j < sizeRight) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    private static void sort(int arr[], int l, int r) {
           if (l < r) {
 
            int middle = l + (r - l) / 2;
 
            sort(arr, l, middle);
            sort(arr, middle + 1, r);
 
            merge(arr, l, middle, r);
        }
    }

    public static void mergeSort(int arr[], int size){
        sort(arr,0,size-1);
    }
}
