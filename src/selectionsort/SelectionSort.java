package selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void swap(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void recursiveSelectionSort(int[] arr, int i, int n) {
        int min = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) min = j;
        }
        swap(arr, min, i);
        if (i + 1 < n) recursiveSelectionSort(arr, i + 1, n);
    }

    public static void main(String[] args) {

        int[] arr = new int[] {4, -2, 0, 5, 2, 7, 10};
        //selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        recursiveSelectionSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
