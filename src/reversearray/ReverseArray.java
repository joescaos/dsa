package reversearray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,12};
        reverseArray(arr);

    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            --end;
        }
        System.out.println(Arrays.toString(arr));
    }


}
