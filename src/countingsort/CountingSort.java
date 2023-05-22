package countingsort;

import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] arr) {
        int max = -1;
        for (int i: arr) {
            if (i > max) {
                max = i;
            }
        }
        int[] c = new int[max + 1];
        Arrays.fill(c, 0);
        for (int i: arr) {
            c[i] += 1;
        }

        int j = 0;
        for (int i = 0; i <= max; i++) {
            while(c[i] > 0) {
                arr[j] = i;
                c[i]--;
                j++;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 0, 5, 2, 7, 10};
        System.out.println(Arrays.toString(countingSort(arr)));;
    }
}
