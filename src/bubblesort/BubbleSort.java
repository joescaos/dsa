package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, -2, 0, 5, 2, 7, 10};
        System.out.println(Arrays.toString(bubbleSort(arr)));;
    }
}
