package sortedpairsum;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class SortedPairSum {

    public static void sortedPairSum(int[] arr, int x) {
        // Initialize variables pointing to the first and
        // To store indexes of result pair
        int res_l = 0, res_r = 0;
        // variable to store current minimum difference
        int minDiff = Integer.MAX_VALUE;

        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            int e = arr[i];
            // Use binary search to find the element 'elem'
            // in the array such that 'e+elem' is closest to
            // 'x'.
            int left = i + 1, right = arr.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[mid] + e == x) {
                    res_l = i;
                    res_r = mid;
                    minDiff = 0;
                    break;
                }

                // Check if this pair is closer than the
                // closest pair so far
                if (Math.abs(arr[mid] + e - x) < minDiff) {
                    minDiff = Math.abs(arr[mid] + e - x);
                    res_l = i;
                    res_r = mid;
                }

                if (arr[mid] + e < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        // Print the pair
        System.out.println(arr[res_l] + " and " + arr[res_r]);

    }

    public static void main(String[] args) {

        int[] arr = {10, 22, 28, 29, 30, 40};
        sortedPairSum(arr, 30);
    }
}
