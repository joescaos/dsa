package krotate;

import java.util.Arrays;

public class KRotate {

    static int[] kRotateAlgorithm(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int i, j;

        // rotate the k elements
        for (i = n - k, j = n - 1; i < j ; i ++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // rotate the first n - k elements
        for (i = 0, j = n - k - 1; i < j ; i ++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // rotate the whole array
        for (i = 0, j = n - 1; i < j ; i ++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kRotateAlgorithm(new int[]{1, 3, 6, 89, 98, 102}, 1)));
    }
}
