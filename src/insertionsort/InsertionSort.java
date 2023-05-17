package insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length - 1 ; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev+1] = current;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] {4, -2, 0, 5, 2, 7, 10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
