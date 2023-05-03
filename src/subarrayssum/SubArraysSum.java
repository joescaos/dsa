package subarrayssum;

public class SubArraysSum {

    public static int printingSubArrays(int[] arr) {
        int largestSum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum += arr[k];
                }
                largestSum = Math.max(largestSum, subArraySum);
            }
        }
        return largestSum;
    }

    public static int prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int largestSum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                int subArraySum = i > 0 ? prefix[j] - prefix[i-1]
                        : prefix[j];
                largestSum = Math.max(largestSum, subArraySum);
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,12};
        long startTime = System.nanoTime();
        System.out.println(printingSubArrays(arr));
        long finalTime = System.nanoTime() - startTime;
        System.out.println("Time of execution brute sum: " + finalTime);
        long startTime2 = System.nanoTime();
        System.out.println(prefixSum(arr));
        long finalTime2 = System.nanoTime() - startTime2;
        System.out.println("Time of execution prefix sum: " + finalTime2);
    }
}
