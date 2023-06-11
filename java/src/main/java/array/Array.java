package array;

public class Array {
    public static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static Boolean sorted(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            if (!(arr[i-1] < arr[i])) {
                return false;
            }
        }
        return true;
    }
}
